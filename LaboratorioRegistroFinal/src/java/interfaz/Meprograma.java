/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.List;
import model.Programa;


/**
 *
 * @author APRENDIZ
 */
public interface Meprograma {
    public Programa list(int id);
    public List listadoP();
    public boolean registrapro(Programa ap);
    public boolean actualizarpro(Programa ap);
    public boolean eliminarpro(int id);
}
