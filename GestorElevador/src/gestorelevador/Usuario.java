/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorelevador;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

/** 
 * @author Paulo Rubim.f
 */
public class Usuario extends Agent{
    public String peso = "60";
    public String andar1 = "1";
    public String andar2 = "2";
    public String elevador = "1";
    
    @Override
    protected void setup(){
        addBehaviour(new OneShotBehaviour(){
        public void action(){
            String array[] = new String[5];
            array[0] = elevador;
            array[1] = andar1;
            array[2] = andar2;
            array[4] = peso;
            
            ACLMessage msg1 =new ACLMessage(ACLMessage.INFORM); 
            msg1.setContent(elevador+","+andar1+","+andar2+","+"usuario"+","+peso);
            msg1.addReceiver(new AID("Gestor1",AID.ISLOCALNAME));
            send(msg1) ;
            }
        });
    }
    
}
