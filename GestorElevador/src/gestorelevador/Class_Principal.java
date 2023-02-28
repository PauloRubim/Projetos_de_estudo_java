/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorelevador;

import jade.core.Agent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

/**
 *
 * @author Paulo Rubim.f
 */
public class Class_Principal extends Agent{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        jade.core.Runtime rt = jade.core.Runtime.instance();
        Profile p = new ProfileImpl();
        p.setParameter(Profile.MAIN_HOST, "localhost");
        p.setParameter(Profile.GUI, "true");
        ContainerController cc =rt.createMainContainer(p);
        AgentController ac;
        try{
            ac=cc.createNewAgent("Gestor1","gestorelevador.Gestor",null );
            ac.start();
            ac=cc.createNewAgent("Elevador1","gestorelevador.Elevador",null );
            ac.start();
            ac=cc.createNewAgent("Usuario1","gestorelevador.Usuario",null );
            ac.start();
        }catch(StaleProxyException e){  
            e.printStackTrace();
        }
    }
    
}
