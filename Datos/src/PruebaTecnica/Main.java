
package PruebaTecnica;


import Controlador.ctrPersona;
import Controlador.ctrPrincipal;
import Modelo.Conexion;
import Modelo.ConsultasPersona;
import Modelo.Persona;
import Vista.Crud;


public class Main {

    
    public static void main(String[] args) {
         Persona Per = new Persona();
        ConsultasPersona PersonaC = new ConsultasPersona();
        Crud frmPersona = new Crud();
        ctrPersona ctrPer = new ctrPersona(Per,frmPersona,PersonaC);
        
        ctrPrincipal ctrPri = new ctrPrincipal( frmPersona );
        ctrPri.inciar();
        frmPersona.setVisible(true);
    }
    
}
