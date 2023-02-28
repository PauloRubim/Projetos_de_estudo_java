
package projetopessoas;
public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor(); 
        Funcionario p4 = new Funcionario(); 
        
        p1.setNome("Pedro"); 
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p2.setCurso("informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("estoque");
        
       // p1.receberAumento(550.20f); Pessoa nao pode receber porque é um metodo exclusivo de um filho
       // p2.mudarTrabalho(); da mesma forma este metodo nao pertence a p2
       // p4.cancelarMatricula(); da mesma forma este metodo nao pertence a p4
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


        
        
        
    }
    
}
