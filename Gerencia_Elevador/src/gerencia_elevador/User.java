/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerencia_elevador;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Rubim.f
 */

public class User extends Agent{
    @Override
    protected void setup(){
        addBehaviour(new OneShotBehaviour(){
        public void action(){
            //enviar mensagem 
            ACLMessage msg =new ACLMessage(ACLMessage.INFORM);
            //conteudo
            msg.setContent("olha a mensagem aqui!");
            //quem vai receber 
            msg.addReceiver(new AID("agente",AID.ISLOCALNAME));
            send(msg) ;
            }
        });
    }

} 
    
    
