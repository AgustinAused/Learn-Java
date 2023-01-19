package datos;

// imports
import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaJDBC{

    // patron de diseño DAO(Data Access Object)
    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES (?,?,?,?)  ";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? where id_persona = ?";

    public PersonaJDBC() {
    }

    public PersonaJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    
    public List<Persona> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement smtm = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_SELECT);
            rs = smtm.executeQuery();
            while (rs.next()) {
                // persona = new Persona( rs.getInt("id_persona"), rs.getString("nombre"), rs.getString("apellido"),rs.getString("email"),rs.getString("telefono"));

                // se extrae los atributos del resultado de la sentrencia sql 
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                // se crea el objeto Persona
                persona = new Persona(idPersona, nombre, apellido, email, telefono);

                // se agrega a la lista de Personas 
                personas.add(persona);
            }

        } finally {
            try {

                Conexion.close(rs);
                Conexion.close(smtm);
                if (this.conexionTransaccional == null) {

                    Conexion.close(conn);
                }
            } catch (SQLException ex) {

                ex.printStackTrace(System.out);
            }

        }
        return personas;
    }

    
    
    public int insertar(Persona persona)throws SQLException{
        Connection conn = null;
        PreparedStatement smtm = null;

        int registro = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_INSERT);
            smtm.setString(1, persona.getNombre());
            smtm.setString(2, persona.getApellido());
            smtm.setString(3, persona.getEmail());
            smtm.setString(4, persona.getTelefono());

            registro = smtm.executeUpdate();
        } finally {
            try {
                Conexion.close(smtm);
                if (this.conexionTransaccional == null) {

                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return registro;
    }

  
    public int actualizarRegitro(Persona persona)throws SQLException {
        Connection conn = null;
        PreparedStatement smtm = null;
        int registro = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_UPDATE);
            smtm.setString(1, persona.getNombre());
            smtm.setString(2, persona.getApellido());
            smtm.setString(3, persona.getEmail());
            smtm.setString(4, persona.getTelefono());
            smtm.setInt(5, persona.getIdPersona());

            registro = smtm.executeUpdate();
        } finally {
            try {
                Conexion.close(smtm);
                if (this.conexionTransaccional == null) {

                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return registro;
    }


    public int eliminarRegistro(Persona persona)throws SQLException {
        Connection conn = null;
        PreparedStatement smtm = null;
        int registro = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_DELETE);
            smtm.setInt(1, persona.getIdPersona());

            registro = smtm.executeUpdate();
        } finally {
            try {
                Conexion.close(smtm);
                if (this.conexionTransaccional == null) {

                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registro;
    }

}
