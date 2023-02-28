
public class PrgTesteDecisionTree {

	public static void main(String[] args) {

		Record reg;
		DataSet dataset = new DataSet();

		// Dia 1
		reg = new Record();
		reg.add("Aparencia", "ensolarado");
		reg.add("Temperatura", "quente");
		reg.add("Umidade", "alta");
		reg.add("Ventando", "fraco");
		reg.add("JogouTenis", "n�o");
		dataset.add(reg);

		// Dia 2
		reg = new Record();
		reg.add("Aparencia", "ensolarado");
		reg.add("Temperatura", "quente");
		reg.add("Umidade", "alta");
		reg.add("Ventando", "forte");
		reg.add("JogouTenis", "n�o");
		dataset.add(reg);

		// Dia 3
		reg = new Record();
		reg.add("Aparencia", "nublado");
		reg.add("Temperatura", "quente");
		reg.add("Umidade", "alta");
		reg.add("Ventando", "fraco");
		reg.add("JogouTenis", "sim");
		dataset.add(reg);

		// Dia 4
		reg = new Record();
		reg.add("Aparencia", "chuva");
		reg.add("Temperatura", "moderada");
		reg.add("Umidade", "alta");
		reg.add("Ventando", "fraco");
		reg.add("JogouTenis", "sim");
		dataset.add(reg);

		// Dia 5
		reg = new Record();
		reg.add("Aparencia", "chuva");
		reg.add("Temperatura", "fria");
		reg.add("Umidade", "normal");
		reg.add("Ventando", "fraco");
		reg.add("JogouTenis", "sim");
		dataset.add(reg);

		// Dia 6
		reg = new Record();
		reg.add("Aparencia", "chuva");
		reg.add("Temperatura", "fria");
		reg.add("Umidade", "normal");
		reg.add("Ventando", "forte");
		reg.add("JogouTenis", "n�o");
		dataset.add(reg);

		// Dia 7
		reg = new Record();
		reg.add("Aparencia", "nublado");
		reg.add("Temperatura", "fria");
		reg.add("Umidade", "normal");
		reg.add("Ventando", "forte");
		reg.add("JogouTenis", "sim");
		dataset.add(reg);

		// Dia 8
		reg = new Record();
		reg.add("Aparencia", "ensolarado");
		reg.add("Temperatura", "moderada");
		reg.add("Umidade", "alta");
		reg.add("Ventando", "fraco");
		reg.add("JogouTenis", "n�o");
		dataset.add(reg);

		// Dia 9
		reg = new Record();
		reg.add("Aparencia", "ensolarado");
		reg.add("Temperatura", "fria");
		reg.add("Umidade", "normal");
		reg.add("Ventando", "fraco");
		reg.add("JogouTenis", "sim");
		dataset.add(reg);

		// Dia 10
		reg = new Record();
		reg.add("Aparencia", "chuva");
		reg.add("Temperatura", "moderada");
		reg.add("Umidade", "normal");
		reg.add("Ventando", "fraco");
		reg.add("JogouTenis", "sim");
		dataset.add(reg);

		// Dia 11
		reg = new Record();
		reg.add("Aparencia", "ensolarado");
		reg.add("Temperatura", "moderada");
		reg.add("Umidade", "normal");
		reg.add("Ventando", "forte");
		reg.add("JogouTenis", "sim");
		dataset.add(reg);

		// Dia 12
		reg = new Record();
		reg.add("Aparencia", "nublado");
		reg.add("Temperatura", "moderada");
		reg.add("Umidade", "alta");
		reg.add("Ventando", "forte");
		reg.add("JogouTenis", "sim");
		dataset.add(reg);

		// Dia 13
		reg = new Record();
		reg.add("Aparencia", "nublado");
		reg.add("Temperatura", "quente");
		reg.add("Umidade", "normal");
		reg.add("Ventando", "fraco");
		reg.add("JogouTenis", "sim");
		dataset.add(reg);

		// Dia 14
		reg = new Record();
		reg.add("Aparencia", "chuva");
		reg.add("Temperatura", "moderada");
		reg.add("Umidade", "alta");
		reg.add("Ventando", "forte");
		reg.add("JogouTenis", "n�o");
		dataset.add(reg);

		// Definindo o atributo que queremos usar como classe
		dataset.setAtributoDeClasse("JogouTenis");
		
		// Criando e construindo a �rvore de decis�o usando como base de treino
		// o conjunto de dados representado pelo objeto dataset.
		DecisionTree arvDecisao = new DecisionTree();
		arvDecisao.construir(dataset);
		
		// Exibindo a �rvore de Decis�o ap�s a sua constru��o
		System.out.println("--:: �rvore de Decis�o para esse conjunto de dados ::--");
		System.out.println(arvDecisao);
		
		// Vamos criar um novo registro para ver qual seria a sua classifica��o
		Record registro = new Record();
		registro.add("Aparencia", "nublado");
		registro.add("Temperatura", "moderada");
		registro.add("Umidade", "normal");
		registro.add("Ventando", "fraco");
		
		// Classificando o novo caso
		System.out.println("Nestas condi��es:");
		System.out.println(registro);
		System.out.println("Ser� que ele jogaria tenis?");
		System.out.println("E a resposta �: " + arvDecisao.getClassificacao(registro) );

		// Now you are ready to became a Jedi, my Padawan!
		// May the force be with you!
		System.exit(0);
	}

}
