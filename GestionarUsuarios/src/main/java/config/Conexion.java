package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection con;
    
    public Conexion()
    {
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbd:mysql://localhost:3306/creaciontablas","root","");
        
    }catch(Exception e)
    {
    System.err.println("Error"+e);
    }

}
    public Connection getConnection()
    {
    return con;
    }
}