
package pilha;
public class Pilha {

    public static void main(String[] args) {
        CriandoPilha p = new CriandoPilha();
        p.push(5);
        p.push(4);
        p.push(3);
        p.push(2);
        p.push(1);
        
        while (!p.isEmpty()){ // enquanto n estiver vazia
        int elemento = p.pop();
            System.out.println("Desempilhei " + elemento);
        }

        int e = p.pop();
    }   
}
