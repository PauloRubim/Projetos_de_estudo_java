package polimorfismo;
// POLIMORFISMO DE SOBREPOSIÇÃO (ASSINATURAS IGUAIS)
public class Polimorfismo {

    public static void main(String[] args) {
        //Animal n= new Animal(); classe abstrata, por  tanto nao pode ser instanciada
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();  
        /*
        m.setPeso(43.5f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        a.locomover();
        p.locomover();
        r.locomover();
        */
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga(); 
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        c.locomover(); 
        k.locomover();
    }
    
}
