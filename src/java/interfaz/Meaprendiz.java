/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.List;
import model.Aprendiz;


public interface Meaprendiz
{
    
    public Aprendiz list(int id);
    public List listadoA();
    public boolean registraap(Aprendiz ap);
    public boolean actualizarap(Aprendiz ap);
    public boolean eliminarap(int id);
    
}
