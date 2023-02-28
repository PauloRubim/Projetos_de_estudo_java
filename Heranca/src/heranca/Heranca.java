package heranca;
    // usaremos a palavra final nas classes sempre que não quisermos que ela tenha filhos
    // ou tambem nos metodos sempre que nao quisermos que ele seja subscrito.
    // ex: public final Class Aluno, ou public final void pagarMensalidade(){}.
public class Heranca {

    public static void main(String[] args) {  
    //Pessoa p1 = new Pessoa(); uma classe abstrata nao pode ser instanciada
    /*
    Visitante v1 = new Visitante();
    v1.setNome("Juvenal");
    v1.setIdade(22);
    v1.setSexo("M");   
    System.out.println(v1.toString());
   */ 
    Aluno a1 = new Aluno();
    a1.setNome("Cladio");
    a1.setMatricula(123123);
    a1.setCurso("Informatica");
    a1.setIdade(16);
    a1.setSexo("M");
    a1.pagarMensalidade();
    // entao aluno é uma especialização de pessoa e pessoa é uma generalização de aluno
    Bolsista b1 = new Bolsista();
    b1.setMatricula(24234);
    b1.setNome("Jubileu");
    b1.setBolsa(12.5f);
    b1.setSexo("M");
    b1.pagarMensalidade();
    }   
}
