import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataSet {
	
	private List<Record> registros;
	private String atributoDeClasse;


	public DataSet() {
		registros = new ArrayList<Record>();
		atributoDeClasse = "<n�o definido>";
	}
	
	public DataSet(List<Record> registros, String atributo) {
		this.registros = registros;
		this.atributoDeClasse = atributo;
	}	
	
	public void setAtributoDeClasse(String atributo) {
		this.atributoDeClasse = atributo;
	}
	
	public String getAtributoDeClasse() {
		return this.atributoDeClasse;
	}

	public void add(Record reg) {
		registros.add(reg);
	}
	

	public Record getRegistroAt(int index) {
		if (registros.isEmpty())
			return null;
		else if (registros.size() <= index )
			return null;
		else
			return registros.get(index);
	}
	

	public List<Record> getRegistros() {
		return registros;
	}
	
	public DataSet getSubSet(String atributo, String valor) {
		if (registros.isEmpty())
			return null;
		else {
			List<Record> subConjunto = new ArrayList<Record>();
			for (Record registro : registros)
				if (registro.getValor(atributo).equals(valor))
					subConjunto.add(registro);
			return new DataSet(subConjunto, atributoDeClasse);
		}
	}
	
	public Set<String> getValoresDoAtributo(String atributo) {
		if (registros.isEmpty())
			return null;
		else {
			Set<String> listaDeValores = new HashSet<String>();
			for (Record registro : registros)
				listaDeValores.add( registro.getValor(atributo) );			
			return listaDeValores;
		}
	}
	

	public double entropia() {
		return entropia(registros);
	}

	private double entropia(List<Record> registros) {
		if (atributoDeClasse.equals("<n�o definido>"))
			throw new RuntimeException("Atributo de classe n�o definido para o conjunto de dados");		
		else if (registros.isEmpty())
			return 0;
		else {
			double entropia = 0;
			String[] valores = getValoresDoAtributo(atributoDeClasse).toArray(new String[0]);
			for (String valor : valores) {
				DataSet subSet = getSubSet(atributoDeClasse, valor);
				double frac = ((double) subSet.size()) / registros.size();
				entropia += -frac * (Math.log(frac)/Math.log(2));
			}
			return entropia;
		}
	}
	
	public double ganho(String atributo) {
		if (registros.isEmpty())
			return 0;
		else {
			double ganho = entropia();
			String[] valores = getValoresDoAtributo(atributo).toArray(new String[0]);
			for (String valor : valores) {
				DataSet subSet = getSubSet(atributo, valor);
				double frac = ((double) subSet.size()) / registros.size();
				ganho += -frac * subSet.entropia();
			}
			return ganho;
		}
	}

	public int size() {
		return registros.size();
	}

	public boolean isEmpty() {
		return registros.isEmpty();
	}


	@Override
	public String toString() {
		String msg = "";
		List<String> atributos = registros.get(0).getAtributos();
		for (int i = 0; i < atributos.size(); i++)
			msg += "+---------------";
		msg += "+\n|";
		for(String atributo : atributos)
			if (atributo.equals(atributoDeClasse))
				msg += String.format("<<%-11s>>|", atributo);
			else
				msg += String.format("%-15s|", atributo);
		msg += "\n";
		for (int i = 0; i < atributos.size(); i++)
			msg += "+---------------";
		msg += "+\n";
		for (Record registro : registros) {
			msg += "|";
			for (String valor : registro.getValores())
				msg += String.format("%-15s|", valor);
			msg += "\n";
		}
		for (int i = 0; i < atributos.size(); i++)
			msg += "+---------------";
		msg += "+\n";
		return msg;
	}
	
}
