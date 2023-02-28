package heranca;

public class Bolsista extends Aluno {
    private float bolsa;
        
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento realizado");
        
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    void setMatricula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
