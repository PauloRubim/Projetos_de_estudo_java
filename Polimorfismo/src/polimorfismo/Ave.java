package polimorfismo;

public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho() {
        System.out.println("Contruindo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
}
