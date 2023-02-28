package pilha;
public class CriandoPilha {
    
        int elementos[];
        int topo; // qual posiçao esta o ultimo elemento
    
        public CriandoPilha(){
        elementos = new int[10];  
        topo = -1; //posição invalidad do vetor        
        }
        
    public void push(int e){
        if(isFull()){
            System.out.println("A pilha esta cheia");
        }
       topo++;
       elementos[topo]=e; 
        
    }
    public int pop(){
        int e;
        if (isEmpty()){
            System.out.println("Pilha esta vazia"); 
        }
            
        e= elementos[topo]; 
        topo--;
        return e;        
    }
    public boolean isEmpty(){
            // ou so return(topo == -1);
            
            return topo == -1;
    }
    public boolean isFull(){
        return (topo == 9);       
    }
    public int top(){
        if(isEmpty()){
            System.out.println("Pilha vazia");          
        }
        return elementos[topo];
        
    }
}
