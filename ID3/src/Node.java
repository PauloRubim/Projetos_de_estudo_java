import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Node {

	private String atributo;
	private double ganho;
	private DataSet subSet;
	
	private boolean isFolha;
	private String valor;	
	
	private Map<String,Node> descendentes;
	private int nivel;
	

	public Node(DataSet baseDados) {
		this.atributo = "<nao definido>";
		this.ganho = 0;
		this.subSet = baseDados;
		this.isFolha = false;
		this.valor = "<nao definido>";
		this.descendentes = null;
	}

	public String getAtributo() {
		return atributo;
	}


	public String getValor() {
		if (!isFolha)
			throw new RuntimeException("Este nao he um nodo folha da �rvore, � impossivel retornar a classificao�o a partir dele");
		return valor;
	}
	
	public boolean isFolha() {
		return (isFolha || (descendentes == null));
	}

	private void addDescente(String valor, Node filho) {
		if (descendentes == null)
			descendentes = new LinkedHashMap<String,Node>();
		filho.nivel = this.nivel + 1;
		descendentes.put(valor, filho);
	}
	

	public void construir() {
		if (subSet.isEmpty())
			throw new RuntimeException("Base de dados sem registros (vazia), impossivel construir uma arvore de decisao.");
		if (subSet.entropia() == 0) {
			isFolha = true;
			valor = subSet.getRegistroAt(0).getValor( subSet.getAtributoDeClasse() );
		}
		else {
			isFolha = false;

			for (String atrib : subSet.getRegistroAt(0).getAtributos()) {
				if ( !atrib.equals(subSet.getAtributoDeClasse()) ) {
					double ganhoAtrib = subSet.ganho(atrib);
					if (ganho < ganhoAtrib) {
						ganho = ganhoAtrib;
						atributo = atrib;
					}
				}
			}

			for (String valor : subSet.getValoresDoAtributo(atributo))
				addDescente(valor, new Node(subSet.getSubSet(atributo, valor)) );
			
			for (Entry<String, Node> e : descendentes.entrySet()) {
				e.getValue().construir();
			}
		}
	}


	public Node getProximoNode(String valor) {
		if (isFolha)
			throw new RuntimeException("Nodo folha, use getValor() para determinar a classificao.");		
		return descendentes.get(valor);
	}
	

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
