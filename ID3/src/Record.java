import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Record {

	private static int cont = 0;	
	
	private int id;					
	private Map<String, String> map;

	public Record() {
		map = new LinkedHashMap<String, String>();
		id = ++cont;
	}

	
	public void add(String atributo, String valor) {
		map.put(atributo, valor);
	}
	
	
	public int getID() {
		return id;
	}
	
	public int getSize() {
		return map.size();
	}
	
	
	public String getValor(String atributo) {
		return map.get(atributo);
	}
	
	public List<String> getValores() {
		if (map.isEmpty())
			return null;
		else {
			List<String> listaDeValores = new ArrayList<String>();
			for(Entry<String,String> e : map.entrySet()) {
				listaDeValores.add( e.getValue() );
			}
			return listaDeValores;
		}
	}
	
	public List<String> getAtributos() {
		if (map.isEmpty())
			return null;
		else {
			List<String> listaDeValores = new ArrayList<String>();
			for(Entry<String,String> e : map.entrySet()) {
				listaDeValores.add( e.getKey() );
			}
			return listaDeValores;
		}
	}

	@Override
	public String toString() {
		String msg = "";
		for(Entry<String,String> e : map.entrySet())
			msg += e.getKey() + "=\"" + e.getValue() + "\" ";
		return msg;
	}
}
