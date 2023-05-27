
package modeldao;

import config.Conexion;
import interfaz.MeFicha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aprendiz;
import model.Ficha;

/**
 *
 * @author APRENDIZ
 */
public class FichaDao implements MeFicha{
   
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Ficha fi=new Ficha();
    int id;
   
    
    @Override
    public Ficha list(int cod) {
        String sql = "insert into ficha(codficha,cantiaprendices,nombrepro,nombreapre)values('"+fi.getCodFicha()+"','"+fi.getCantiaprendices()+"','"+fi.getNombrepro()+"','"+fi.getNombreapre()+"')";
    try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
            
        }catch(Exception e)
        {
        }
        return fi;
    }
    @Override
    public List listaFichas() {
         ArrayList<Ficha> lista = new ArrayList<Ficha>();
            String sql = " select * from ficha";
            try{
                con=cn.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                Ficha fi=new Ficha();
                fi.setCodFicha(rs.getInt("codFicha"));
                fi.setCantiaprendices(rs.getInt("cantiaprendices"));
                fi.setNombreapre(rs.getInt("nombreapre"));
                fi.setNombrepro(rs.getInt("nombrepro"));
                lista.add(fi);
            }
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Programa ya esta registrado"+ex.getMessage());

            }return lista;

    }

    @Override
    public boolean registroficha(Ficha fi) {
        String sql="insert into ficha(codficha,cantiaprendices,nombrepro,nombreapre)values('"+fi.getCodFicha()+"','"+fi.getCantiaprendices()+"','"+fi.getNombrepro()+"','"+fi.getNombreapre()+"')";
        try{
          con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Ficha registrada");
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Programa ya esta registrado");
        }
        return false;
    }

    @Override
    public boolean eliminarficha(int cod) {
    String sql="delete from ficha where codficha="+cod; 
        try{
          con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e)
        {}
        return false;
    }
    
    @Override
    public boolean actualizarficha(Ficha ficha) {
        String sql="delete from programa where codprograma="+ficha; 
        try{
          con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e)
        {}
        return false;
    }

}