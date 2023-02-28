package gestorelevador;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class Elevador extends Agent{
@Override
    protected void setup(){
        addBehaviour(new CyclicBehaviour(){
            
            public void action(){
                //receber a mensagem 
                ACLMessage msg2 = receive();
                if(msg2!=null){
                    addBehaviour(new OneShotBehaviour(){
                    public void action(){
                    ACLMessage msg3 =new ACLMessage(ACLMessage.INFORM);
                    String array2[] = new String[5];
                    array2 = msg2.getContent().split(",");
                    msg3.setContent(array2[0]+","+array2[1]+","+array2[2]+","+"elevador"+","+array2[4]);           
                    msg3.addReceiver(new AID("Gestor1",AID.ISLOCALNAME));
                    
//                    try{
//                        new Thread().sleep(1000);
//                    }catch(InterruptedException ex){
//                        Logger.addLogger(Elevador.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                    send(msg3) ;
                    }
                });
                }else{
                    block();
                }
                }
            });
    }
}
