package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;
//import java.util.List;


public class TestManejoPersonas {
    
    public static void main(String[] args) {
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConexion();
            
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            
            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);
            
            var perosna = new Persona(9	,"martina", "paul","martuPaul@gmail.com","1198765432");
            personaJDBC.actualizarRegitro(perosna);
            
            perosna = new Persona("JoseLuis", "gonzales","jgonzales@gmail.com","1111111111");
            personaJDBC.insertar(perosna);
            
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion Exitosamente!!");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
    }
}
