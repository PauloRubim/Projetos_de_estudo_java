package gestorelevador;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class Gestor extends Agent{
    @Override
    protected void setup(){
        int contador_usuario = 1;
        addBehaviour(new CyclicBehaviour(){            
        public void action(){ 
            ACLMessage msg1 = receive();
            if(msg1!=null){
                String array[] = new String[5];
                array = msg1.getContent().split(",");
                if(array[3].equals("usuario")){
                    System.out.println("Pedido Recebido!");
                    System.out.println("Usuario: Peso "+array[4]+"kg, gostaria de ir do andar: "+array[1]+" ao "+array[2]);
                   
                    addBehaviour(new OneShotBehaviour(){
                    public void action(){
                        ACLMessage msg2 =new ACLMessage(ACLMessage.INFORM);
                        msg2.setContent(msg1.getContent());
                        String array[] = new String[5];
                        array = msg1.getContent().split(",");
                        msg2.addReceiver(new AID("Elevador"+array[0],AID.ISLOCALNAME));
                        send(msg2) ;
                    }
                    });
                }else{
                    String array3[] = new String[5];
                    array = msg1.getContent().split(",");
                    
                    System.out.println("Elevador"+array[0]+": Mensagem do Gestor Recebiada. Deslocando do andar "+array[1]+" ao "+array[2]);
                    int andar1 = Integer.parseInt(array[1]);
                    int andar2 = Integer.parseInt(array[2]);
                    
                    
                    if(andar1<andar2){
                        for(int i = andar1; i<andar2; i++){
                            System.out.println("Deslocando... Andar: "+i+"\n");
                        } 
//                            addBehaviour(new OneShotBehaviour(){
//                                    public void action(){
//                                        //enviar mensagem 
//                                        ACLMessage msg2 =new ACLMessage(ACLMessage.INFORM);
//                                        //conteudo
//                                        
//                                        msg2.setContent();
//                                        //quem vai receber 
//                                        msg2.addReceiver(new AID("usuario1",AID.ISLOCALNAME));
//                                        send(msg2) ;
//                                        }
//                                    });                        
//                            
//                        
                    }else{
                        for(int i = andar2; i<andar1; i++){
                            System.out.println("Deslocando... Andar: "+i+"\n");
                        }
                        
                        
//                        addBehaviour(new OneShotBehaviour(){
//                                    public void action(){
//                                        //enviar mensagem 
//                                        ACLMessage msg2 =new ACLMessage(ACLMessage.INFORM);
//                                        //conteudo
//                                        msg2.setContent("olha a mensagem aqui!");
//                                        //quem vai receber 
//                                        msg2.addReceiver(new AID("usuario1",AID.ISLOCALNAME));
//                                        send(msg2) ;
//                                        }
//                                    });                                             
                        
                    }
                }
                System.out.println("Chegamos ao destino! \n");
            }else{
                block();
            }
        }
        });
    }
    
}
