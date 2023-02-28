import java.io.IOException;

public class PrgTesteParseFileIris {

	public static void main(String[] args) {

		DataSet dataset = null;
		
		ParseFile databaseFile = new ParseFile();
		databaseFile.setArquivo("./Iris.txt");
		try {
			dataset = databaseFile.getRegistros();
		} catch (IOException e) {
			System.err.println("Ops! Problemas ao ler o arquivo.");
			System.err.println("ERRO" + e.getMessage());
		}

		dataset.setAtributoDeClasse("Esp�cieDeOrqu�dea");
		System.out.println(dataset);
		

		Arv_decisao arvDecisao = new Arv_decisao();
		arvDecisao.construir(dataset);
		
		System.out.println("--:: �rvore de Decis�o para esse conjunto de dados ::--");
		System.out.println(arvDecisao);
		
		System.out.println("\n");
			
		Record registro1 = new Record();

		registro1.add("ComprDaS�pala","longa");
		registro1.add("LargDaS�pala","fina");
		registro1.add("ComprDaP�tala","longa");
		registro1.add("LargDaP�tala","m�dia");
		
		System.out.println("Para o caso: " + registro1);
		System.out.println("� esperado \"Iris-virginica\" e a resposta foi: " + arvDecisao.getClassificacao(registro1) );
		
		Record registro2 = new Record();

		registro2.add("ComprDaS�pala","m�dia");
		registro2.add("LargDaS�pala","fina");
		registro2.add("ComprDaP�tala","longa");
		registro2.add("LargDaP�tala","m�dia");
		
		System.out.println("Para o caso: " + registro2);
		System.out.println("� esperado \"Iris-versicolor\" e a resposta foi: " + arvDecisao.getClassificacao(registro2) );
		
		Record registro3 = new Record();

		registro3.add("ComprDaS�pala","m�dia");
		registro3.add("LargDaS�pala","larga");
		registro3.add("ComprDaP�tala","curta");
		registro3.add("LargDaP�tala","fina");
		
		System.out.println("Para o caso: " + registro3);
		System.out.println("� esperado \"Iris-setosa\" e a resposta foi: " + arvDecisao.getClassificacao(registro3) );
		
		System.exit(0);
	}

}
