
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasPersona extends Conexion {
       // = Insertar
    public boolean registrar (Persona p){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into persona (cedula, nombre, apellido, telefono, correo) values (?,?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, p.getCedula());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellido());
            ps.setInt(4, p.getTelefono());
            ps.setString(5, p.getCorreo());

            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    } 
    
        // == Actualizar
    public boolean actualizar (Persona p){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update persona set nombre=?, apellido=?, telefono=?, correo=? where Cedula=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido());
            ps.setInt(3, p.getTelefono());
            ps.setString(4, p.getCorreo());                    
            ps.setInt(5, p.getCedula());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    } 
    
            // ==Eliminar
    public boolean eliminar (Persona p){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "delete from persona where cedula=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getCedula());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    } 
    
    
                // === BUSCAR
    public boolean buscar (Persona p){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from persona where cedula=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getCedula());
            rs = ps.executeQuery();
            if(rs.next()){
                p.setCedula(Integer.parseInt(rs.getString("cedula")));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));                
                p.setTelefono(Integer.parseInt(rs.getString("telefono"))); 
                p.setCorreo(rs.getString("correo"));
                return true;
            }
            return false;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    } 
}
