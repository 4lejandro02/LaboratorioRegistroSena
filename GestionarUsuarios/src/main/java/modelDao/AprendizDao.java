package modelDao;

import interfaz.MeAprendiz;
import java.util.List;
import modelo.Aprendiz;

public class AprendizDao implements MeAprendiz{

    @Override
    public Aprendiz list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadoA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean registrar(Aprendiz ap) {
       /* String sql="insert into Aprendiz(documentoa,nombrea,ApellidoA,CorreoA,telefonoa)values('"+ap.getDocumentoa()+"','"+ap.getNombrea()+"','"+ap.getApellidoa()"','"+ap.getCorreoa()"','"+ap.getTelefonoa()+"')";
        try(
                )catch(){
                        }*/
                return false;
    }
    }
    @Override
    public boolean actualizar(Aprendiz aprndz) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
