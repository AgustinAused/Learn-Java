package datos;

// imports
import domain.Persona;
import java.sql.*;
import java.util.*;


public class PersonaDAO implements IPersonaDAO{
    // patron de diseño DAO(Data Access Object)

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES (?,?,?,?)  ";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? where id_persona = ?";

    @Override
    public List<Persona> seleccionar() {
        Connection conn = null;
        PreparedStatement smtm = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            conn = Conexion.getConexion();
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

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {

                Conexion.close(rs);
                Conexion.close(smtm);
                Conexion.close(conn);
            } catch (SQLException ex) {

                ex.printStackTrace(System.out);
            }

        }
        return personas;
    }

    @Override
    public int insertar(Persona persona) {
        Connection conn = null;
        PreparedStatement smtm = null;

        int registro = 0;

        try {
            conn = Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_INSERT);
            smtm.setString(1, persona.getNombre());
            smtm.setString(2, persona.getApellido());
            smtm.setString(3, persona.getEmail());
            smtm.setString(4, persona.getTelefono());

            registro = smtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        } finally {
            try {
                Conexion.close(smtm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return registro;
    }

    @Override
    public int actualizarRegitro(Persona persona) {
        Connection conn = null;
        PreparedStatement smtm = null;
        int registro = 0;

        try {
            conn = Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_UPDATE);
            smtm.setString(1, persona.getNombre());
            smtm.setString(2, persona.getApellido());
            smtm.setString(3, persona.getEmail());
            smtm.setString(4, persona.getTelefono());
            smtm.setInt(5, persona.getIdPersona());

            registro = smtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        } finally {
            try {
                Conexion.close(smtm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return registro;
    }
    
    @Override
    public int eliminarRegistro(Persona persona) {
        Connection conn = null;
        PreparedStatement smtm = null;
        int registro = 0;
        try {
            conn = Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_DELETE);
            smtm.setInt(1, persona.getIdPersona());

            registro = smtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(smtm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registro;
    }

}
