package testeabstrata;

public class TEsteAbstrata {

   public static void main(String[] args) {
        Professor p = new Professor();
        p.setNome("Pedro");
        p.setIdade(40);
        p.setSexo(Sexo.MASCULINO);
        
        System.out.println(p.toString());
   }
    
}
