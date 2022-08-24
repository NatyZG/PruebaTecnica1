
package Controlador;
import Vista.Crud;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ctrPrincipal implements ActionListener {
      private Crud frmcrud;
    
    public ctrPrincipal(Crud frmcrud) {
        this.frmcrud = frmcrud;
        
        //===this.frmcrud.menuCrud.addActionListener(this);
                      
    }

    public void inciar(){
        frmcrud.setTitle("Persona");        
        frmcrud.setLocationRelativeTo(null);
        frmcrud.setLocationRelativeTo(null);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      
            frmcrud.setVisible(true);
            frmcrud.dispose();
        }
        
        
}


   
