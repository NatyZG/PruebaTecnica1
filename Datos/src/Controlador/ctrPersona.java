
package Controlador;

import Modelo.ConsultasPersona;
import Modelo.Persona;
import Vista.Crud;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ctrPersona implements ActionListener  {
    private Persona Per;
    private Crud frmPersona;
    private ConsultasPersona PersonaC;

    public ctrPersona(Persona Per, Crud frmPersona, ConsultasPersona PersonaC) {
        this.Per = Per;
        this.frmPersona = frmPersona;
        this.PersonaC = PersonaC;
        
        this.frmPersona.btnInsertar.addActionListener(this);
        this.frmPersona.btnBuscar.addActionListener(this);
        this.frmPersona.btnEliminar.addActionListener(this);
        this.frmPersona.btnLimpiar.addActionListener(this);
        this.frmPersona.btnActualizar.addActionListener(this);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         //// Insertar
        if(e.getSource()==frmPersona.btnInsertar){
            Per.setCedula(Integer.parseInt(frmPersona.txtCedula.getText()));
            Per.setNombre(frmPersona.txtNombre.getText());
            Per.setApellido(frmPersona.txtApellido.getText());
            Per.setTelefono(Integer.parseInt(frmPersona.txtTelefono.getText()));
            Per.setCorreo(frmPersona.txtCorreo.getText());
        
            if(PersonaC.registrar(Per)){
                JOptionPane.showMessageDialog(null, "los datos fueron insertados");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar");
                limpiar();
            }
        } 
        
                // Actualizar
        if(e.getSource()==frmPersona.btnActualizar){
            Per.setCedula(Integer.parseInt(frmPersona.txtCedula.getText()));
            Per.setNombre(frmPersona.txtNombre.getText());
            Per.setApellido(frmPersona.txtApellido.getText());
            Per.setTelefono(Integer.parseInt(frmPersona.txtTelefono.getText()));
             Per.setCorreo(frmPersona.txtCorreo.getText());
            if(PersonaC.actualizar(Per)){
                JOptionPane.showMessageDialog(null, "registro actualizado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al actualizar");
                limpiar();
            }
        } 
        
        
                        // eliminar
        if(e.getSource()==frmPersona.btnEliminar){
            Per.setCedula(Integer.parseInt(frmPersona.txtCedula.getText()));
            if(PersonaC.eliminar(Per)){
                JOptionPane.showMessageDialog(null, "persona eliminada");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();
            }
        } //------ fin eliminar
        
        
                                //---Buscar
        if(e.getSource()==frmPersona.btnBuscar){
            Per.setCedula(Integer.parseInt(frmPersona.txtCedula.getText()));
            if(PersonaC.buscar(Per)){
                frmPersona.txtCedula.setText(String.valueOf(Per.getCedula()));
                frmPersona.txtNombre.setText(Per.getNombre());
                frmPersona.txtApellido.setText(Per.getApellido());
                frmPersona.txtTelefono.setText(String.valueOf(Per.getTelefono()));
                 frmPersona.txtCorreo.setText(Per.getCorreo());

            }else{
                JOptionPane.showMessageDialog(null, "Error al buscar");
                limpiar();
            }
        } 
        
        if(e.getSource()==frmPersona.btnLimpiar){
            limpiar();
        }
    }
    

     public void limpiar(){
        frmPersona.txtCedula.setText(null);
        frmPersona.txtNombre.setText(null);
        frmPersona.txtApellido.setText(null);
        frmPersona.txtTelefono.setText(null);
        frmPersona.txtCorreo.setText(null);
    }
    
     
    
    
}
