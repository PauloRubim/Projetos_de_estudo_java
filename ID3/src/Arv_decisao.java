
public class Arv_decisao {
	
	private Node raiz = null;
	

	public void construir(DataSet baseDados) {
		raiz = new Node(baseDados);
		raiz.construir();
	}
	

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

	@Override
	public String toString() {
		return raiz.toString();
	}
}
