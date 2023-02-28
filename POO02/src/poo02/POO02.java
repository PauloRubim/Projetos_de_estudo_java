package poo02;
import java.util.Scanner; 
public class POO02 {

    public static void main(String[] args) {
        Custo preco = new Custo();
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Digite o valor do carro: \n");
        x = scan.nextInt(); 
        preco.custo(x);
        
    }
    
}
