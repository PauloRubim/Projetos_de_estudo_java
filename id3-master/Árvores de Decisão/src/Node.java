import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Representa um nodo da �rvore e toda a sub-estrutura a ele ligado. Pode ser
 * de dois tipos: de decis�o (um nodo interno) ou de valor (nodo folha).
 *  
 * @author Leandro Fernandes
 */
public class Node {

	// Nodo de decis�o
	private String atributo;
	private double ganho;
	private DataSet subSet;
	
	// Nodo de classifica��o
	private boolean isFolha;
	private String valor;	
	
	// Referencias para a estrutura��o na forma de �rvore
	private Map<String,Node> descendentes;
	private int nivel;
	
	/**
	 * Cria um nodo ou sub-�rvore que representar� os registros contidos na
	 * base de dados informada.
	 * @param baseDados base de dados, podendo ser um conjunto completo ou
	 * um subconjunto.
	 */
	public Node(DataSet baseDados) {
		this.atributo = "<n�o definido>";
		this.ganho = 0;
		this.subSet = baseDados;
		this.isFolha = false;
		this.valor = "<n�o definido>";
		this.descendentes = null;
	}

	/**
	 * Recupera o atributo de decis�o representado pelo nodo 
	 * @return nome do atributo
	 */
	public String getAtributo() {
		return atributo;
	}

	/**
	 * Recupera a categoria (classe) que o nodo representa 
	 * @return valor do atributo classe
	 */
	public String getValor() {
		if (!isFolha)
			throw new RuntimeException("Este n�o � um nodo folha da �rvore, � imposs�vel retornar a classifica��o a partir dele");
		return valor;
	}
	
	/**
	 * Permite verificar se trata-se ou n�o de um nodo folha na �rvore
	 * @return verdadeiro se for um nodo folha
	 */
	public boolean isFolha() {
		return (isFolha || (descendentes == null));
	}

	/**
	 * Adiciona o novo nodo como filho do nodo corrente, associando-o como o
	 * caminho a ser seguindo quando o atributo de decis�o tiver valor igual a
	 * aquele que foi informado como par�metro.
	 * @param valor valor do atributo de decis�o com o qual o nodo dever� ser associado
	 * @param filho nodo descentente do elemento corrente
	 */
	private void addDescente(String valor, Node filho) {
		if (descendentes == null)
			descendentes = new LinkedHashMap<String,Node>();
		filho.nivel = this.nivel + 1;
		descendentes.put(valor, filho);
	}
	
	/**
	 * Constr�i a �rvore (ou sub-�rvore) que represente os dados do nodo corrente
	 */
	public void construir() {
		if (subSet.isEmpty())
			throw new RuntimeException("Base de dados sem registros (vazia), imposs�vel construir uma �rvore de decis�o.");
		if (subSet.entropia() == 0) {
			isFolha = true;
			valor = subSet.getRegistroAt(0).getValor( subSet.getAtributoDeClasse() );
		}
		else {
			isFolha = false;
			// calcula os ganhos e identifica qual atributo oferece o maior ganho
			for (String atrib : subSet.getRegistroAt(0).getAtributos()) {
				if ( !atrib.equals(subSet.getAtributoDeClasse()) ) {
					double ganhoAtrib = subSet.ganho(atrib);
					if (ganho < ganhoAtrib) {
						ganho = ganhoAtrib;
						atributo = atrib;
					}
				}
			}
			// recupera todos os valores para o atributo que oferece o maior ganho
			// e cria, para cada valor poss�vel, um node com o subset da base de
			// dados original com os registros que contenham o valor especificado
			// para aquele atributo.  
			for (String valor : subSet.getValoresDoAtributo(atributo))
				addDescente(valor, new Node(subSet.getSubSet(atributo, valor)) );
			// por fim, para cada filho do nodo corrente, repetimos o processo
			for (Entry<String, Node> e : descendentes.entrySet()) {
				e.getValue().construir();
			}
		}
	}

	/**
	 * Retorna o pr�ximo nodo da �rvore a ser utilizado quando o atributo de
	 * decis�o tem valor igual ao informado como par�metro.
	 * @param valor um dos valores poss�veis para o atributo de decis�o
	 * @return pr�ximo nodo da �rvore
	 */
	public Node getProximoNode(String valor) {
		if (isFolha)
			throw new RuntimeException("Nodo folha, use getValor() para determinar a classifica��o.");		
		return descendentes.get(valor);
	}
	
	/**
	 * Representa��o na forma textual da estrutura hier�rquica da sub-�rvore
	 * dada a partir deste nodo.
	 */
	@Override
	public String toString() {
		String msg = "";		
		if (isFolha)
			msg += "-> " + valor;
		else {
			msg += "<<" + atributo + ">>";
			for (Entry<String,Node> e : descendentes.entrySet()) {
				msg += "\n";
				for (int i = 0; i < nivel; i++) msg += "\t\t";
				msg += "\t+--" + e.getKey() + "--" + e.getValue();
			}
		}
		return msg;
	}

}
