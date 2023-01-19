package test;

import datos.Conexion;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.*;
import java.util.List;
import datos.PersonaDao;
//import java.util.List;


public class TestManejoPersonas {
    
    public static void main(String[] args) {
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConexion();
            
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            
            PersonaDao personaDao = new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> personas = personaDao.seleccionar();
            personas.forEach(persona ->{
                System.out.println("persona DTO= " + persona);
            });
            
            
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
