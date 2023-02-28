package Calc;
import java.util.Scanner;

public class Calculadora {
    int soma, sub, mul, div;
    
    public static void main(String[] args) {
        int op,num1,num2;
        Scanner scanner = new Scanner(System.in);
        int sair = 1;
        do{
            System.out.println("Calculadora\n1-SOMA\n2-DIFERENÇA\n3-PRODUTO\n4-QUOCIENTE");
            op = scanner.nextInt();
                    
            switch(op){
                case 1:
                    System.out.println("Digite o primeiro número a ser somado:");
                    num1 = scanner.nextInt();
                    System.out.println("Digite o segundo número a ser somado:");
                    num2 = scanner.nextInt();
                    Soma soma = new Soma();
                    System.out.println("RESULTADO: "+soma.somando(num1, num2));
                break;
                
                case 2:
                    System.out.println("Digite o primeiro número a ser subtraido:");
                    num1 = scanner.nextInt();
                    System.out.println("Digite o segundo número a ser subtraido:");
                    num2 = scanner.nextInt();
                    Diferenca dif = new Diferenca();
                    System.out.println("RESULTADO: "+dif.dif(num1, num2));
                break;
                
                case 3:
                    System.out.println("Digite o primeiro número a ser multiplicado:");
                    num1 = scanner.nextInt();
                    System.out.println("Digite o segundo número a ser multiplicado:");
                    num2 = scanner.nextInt();
                    Produto prod = new Produto();
                    System.out.println("RESULTADO: "+ prod.prod(num1, num2));
                break;
                
                case 4:
                    System.out.println("Digite o primeiro número a ser dividido:");
                    num1 = scanner.nextInt();
                    System.out.println("Digite o segundo número a ser dividido:");
                    num2 = scanner.nextInt();
                    Divisao quoc = new Divisao();
                    System.out.println("RESULTADO: "+quoc.quoc(num1, num2));
                break;
            }
        }while(sair == 0);
    }
        
}
