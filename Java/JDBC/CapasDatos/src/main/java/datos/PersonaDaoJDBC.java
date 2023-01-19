package datos;

// imports
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

public class PersonaDaoJDBC implements PersonaDao{

    // patron de diseño DAO(Data Access Object)
    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES (?,?,?,?)  ";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? where id_persona = ?";

    public PersonaDaoJDBC() {
    }

    public PersonaDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    
    @Override
    public List<PersonaDTO> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement smtm = null;
        ResultSet rs = null;
        PersonaDTO persona = null;
        List<PersonaDTO> personas = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_SELECT);
            rs = smtm.executeQuery();
            while (rs.next()) {
                // persona = new PersonaDTO( rs.getInt("id_persona"), rs.getString("nombre"), rs.getString("apellido"),rs.getString("email"),rs.getString("telefono"));

                // se extrae los atributos del resultado de la sentrencia sql 
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                // se crea el objeto PersonaDTO
                persona = new PersonaDTO(idPersona, nombre, apellido, email, telefono);

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

    
    
    @Override
    public int insertar(PersonaDTO persona)throws SQLException{
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

  
    @Override
    public int actualizarRegitro(PersonaDTO persona)throws SQLException {
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


    @Override
    public int eliminarRegistro(PersonaDTO persona)throws SQLException {
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
