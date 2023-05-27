/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import config.Conexion;
import interfaz.Meaprendiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aprendiz;


public class AprendizDao implements Meaprendiz{
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Aprendiz usu=new Aprendiz();
    int id;
    
    @Override
    public Aprendiz list(int ide) {
        String sql = "select * from aprendiz where id ="+ide;
        try{
            con=cn.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                    
                usu.setId(rs.getInt("id"));
                usu.setDocumento(rs.getInt("documento"));
                usu.setNombrea(rs.getString("Nombrea"));
                usu.setApellidoa(rs.getString("Apellidoa"));
                usu.setCorreoa(rs.getString("Correoa"));
                usu.setTelea(rs.getInt("Telea"));
                }
        }catch(Exception e)
        {
            /*JOptionPane.showMessageDialog(null,"No puede traer la", e);*/
        }
            return usu;
        }
    
    @Override
    public List listadoA() {
            ArrayList<Aprendiz> lista = new ArrayList<Aprendiz>();
            String sql = " select * from aprendiz";
            try{
                con=cn.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                Aprendiz usu=new Aprendiz();
                usu.setId(rs.getInt("id"));
                usu.setDocumento(rs.getInt("documento"));
                usu.setNombrea(rs.getString("nombrea"));
                usu.setApellidoa(rs.getString("apellidoa"));
                usu.setCorreoa(rs.getString("correoa"));
                usu.setTelea(rs.getInt("telea"));
                lista.add(usu);
            }
            }catch (SQLException ex) {
                
            }return lista;

    }
    
    @Override
    public boolean registraap(Aprendiz ap) {
        String sql="insert into aprendiz(Documento,Nombrea,Apellidoa,Correoa,Telea)values('"+ap.getDocumento()+"','"+ap.getNombrea()+"','"+ap.getApellidoa()+"','"+ap.getCorreoa()+"','"+ap.getTelea()+"')"; 
        try{
          con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Usuario registrado");
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Usuario ya esta registrado");
        }
        return false;
    }

    @Override
    public boolean actualizarap(Aprendiz ap) {
        String sql="delete from aprendiz where id="+id;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        return false;
    }

    @Override
    public boolean eliminarap(int id) {
     String sql="delete from aprendiz where id="+id;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        return false;
    }

}
    

