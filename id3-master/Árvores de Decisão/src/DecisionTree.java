
/**
 * Representa a �rvore de decis�o capaz de classificar um novo registro com
 * base na estrutura de decis�o constru�da a partir de uma base de dados de
 * treinamento.
 * 
 * @author Leandro Fernandes
 */
public class DecisionTree {
	
	private Node raiz = null;
	
	/**
	 * Constr�i a �rvore de decis�o para o conjunto de dados informado
	 * @param baseDados base de dados para treinamento
	 */
	public void construir(DataSet baseDados) {
		raiz = new Node(baseDados);
		raiz.construir();
	}
	
	/**
	 * Retorna a classifica��o dada para o registro informado, segundo
	 * a �rvore de decis�o constru�da anteriormente.
	 * @param registro
	 * @return
	 */
	public String getClassificacao(Record registro) {
		if (raiz == null)
			throw new RuntimeException("Imposs�vel classificar este registro, pois a �rvore aidna n�o foi constru�da.");
		else {
			Node no = raiz;
			while (!no.isFolha()) {
				String valor = registro.getValor( no.getAtributo() );
				no = no.getProximoNode(valor);
			}
			return no.getValor();
		}
	}

	/**
	 * Representa��o na forma textual da estrutura hier�rquica da �rvore
	 */
	@Override
	public String toString() {
		return raiz.toString();
	}
}
