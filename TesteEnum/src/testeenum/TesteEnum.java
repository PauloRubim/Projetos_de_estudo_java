package testeenum;

public class TesteEnum {

    public static void main(String[] args) {
        
    }
    
    private static void usandoConstantes(){
        int segunda = DiasdaSemanaConstantes.SEGUNDA;
        int terca = DiasdaSemanaConstantes.TERCA;
        int quarta = DiasdaSemanaConstantes.QUARTA;
        int quinta = DiasdaSemanaConstantes.QUINTA;
        int sexta = DiasdaSemanaConstantes.SEXTA;
        int sabado = DiasdaSemanaConstantes.SABADO;
        int domingo = DiasdaSemanaConstantes.DOMINDO;
    }
    
    private static void imprimeDiaSemana(int dia){
        switch(dia){
            case 1:
                System.out.println("Segunda-feira ");
            break;
            
            case 2:
                System.out.println("Terca-feira ");
                break;
                
            case 3:
                System.out.println("Quarta-feira ");
                break;
            
            case 4: 
                System.out.println("Quinta-feira ");
                break;
            case 5:
                System.out.println("Sexta-Feira ");
                break;
            case 6:
                System.out.println("Sabado ");
                break;
            case 7:
                System.out.println("Domindo ");
                break;
        }
    }
}
