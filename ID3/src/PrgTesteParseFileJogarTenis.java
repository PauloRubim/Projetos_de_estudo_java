import java.io.IOException;

public class PrgTesteParseFileJogarTenis {

	public static void main(String[] args) {

		DataSet dataset = null;
		
		ParseFile databaseFile = new ParseFile();
		databaseFile.setArquivo("./jogar_tenis.txt");
		try {
			dataset = databaseFile.getRegistros();
		} catch (IOException e) {
			System.err.println("Ops! Problemas ao ler o arquivo.");
			System.err.println("ERRO" + e.getMessage());
		}

		dataset.setAtributoDeClasse("JogouTenis");
		
		Arv_decisao arvDecisao = new Arv_decisao();
		arvDecisao.construir(dataset);

		System.out.println("--:: Arvore de Decisao para esse conjunto de dados ::--");
		System.out.println(arvDecisao);
		
		Record registro = new Record();
		registro.add("Aparencia", "nublado");
		registro.add("Temperatura", "moderada");
		registro.add("Umidade", "normal");
		registro.add("Ventando", "fraco");

		System.out.println("Nestas condicoes:");
		System.out.println(registro);
		System.out.println("Ser� que ele jogaria tenis?");
		System.out.println("E a resposta he: " + arvDecisao.getClassificacao(registro) );
				
		System.exit(0);
	}

}
