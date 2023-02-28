package gerencia_elevador;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Gestor extends Agent{
 @Override
    protected void setup(){
        addBehaviour(new CyclicBehaviour(){
            
        public void action(){
            //receber a mensagem 
            ACLMessage msg = receive();
            if(msg!=null){
                System.out.println ("Mensagem Recebida:"+msg.getContent());
                //JOptionPane.showMessageDialog(null,"Mensagem Recebida:"+msg.getContent());
            }else{
                block();
            }
            }
        });
    }  
}
