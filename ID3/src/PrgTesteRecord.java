
public class PrgTesteRecord {

	public static void main(String[] args) {

		// Dia 1
		Record reg = new Record();
		reg.add("Aparencia", "ensolarado");
		reg.add("Temperatura", "quente");
		reg.add("Umidade", "alta");
		reg.add("Ventando", "fraco");
		reg.add("JogouTenis", "nao");
		
		for (String atributo : reg.getAtributos())
			System.out.print(String.format("|%-15s", atributo));
		System.out.println("|");
		
		System.out.println(reg);

		System.exit(0);
	}

}