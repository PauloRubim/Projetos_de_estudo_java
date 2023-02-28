package polimosfismo2;
public class Polimosfismo2 {
//POLIMORFISMO DE SOBRECARCA
   
    public static void main(String[] args) {
    //Animal animal = new Animal(); Tipo abstrato, portanto nao posso instancia-la
    Cachorro c = new Cachorro();
    c.reagir("Ola");
    c.reagir(19,00);
    c.reagir(true);
    }    
}
