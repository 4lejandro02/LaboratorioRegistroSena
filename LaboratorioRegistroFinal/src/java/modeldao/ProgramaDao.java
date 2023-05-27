/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import config.Conexion;
import interfaz.Meprograma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Programa;

/**
 *
 * @author APRENDIZ
 */
public class ProgramaDao implements Meprograma{
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Programa p=new Programa();
    
    @Override
    public Programa list(int ide) {
  String sql = "select * from programa where int ="+ide;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            
            p.setCodprograma(rs.getInt("codprograma"));
            p.setNombrepro(rs.getString("nombrepro"));

            }
        }catch(Exception e)
        {
            /*JOptionPane.showMessageDialog(null,"No puede traer la", e);*/
        }
            return p;
        }
    
    

    @Override
    public List listadoP() {
         ArrayList<Programa> lista = new ArrayList<Programa>();
            String sql = " select * from programa";
            try{
                con=cn.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                Programa p = new Programa();
                p.setCodprograma(rs.getInt("codprograma"));
                p.setNombrepro(rs.getString("nombrepro"));
                lista.add(p);
            }
            }catch (SQLException ex) {
                
            }return lista;
    
    }

    @Override
    public boolean registrapro(Programa p) {
      String sql="insert into programa(codprograma,nombrepro)values('"+p.getCodprograma()+"','"+p.getNombrepro()+"')"; 
        try{
          con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Programa registrado");
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Programa ya esta registrado");
        }
        return false;
    }

    @Override
    public boolean actualizarpro(Programa pr) {
  String sql="insert into programa set codprograma='"+p.getCodprograma()+"','"+p.getNombrepro()+"' where codprograma ="+p.getCodprograma()+""; 
        try{
          con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e)
        {}
        return false;
    }

    @Override
    public boolean eliminarpro(int codigopro) {
        String sql="delete from programa where codprograma="+codigopro; 
        try{
          con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e)
        {}
        return false;
    }

    }
    

