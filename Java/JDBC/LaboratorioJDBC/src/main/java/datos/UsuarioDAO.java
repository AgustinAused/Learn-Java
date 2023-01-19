package datos;

// imports
import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuarioDAO implements IUsuarioDAO {
    // patron de diseño DAO(Data Access Object)

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password =?  where id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public UsuarioDAO() {
    }

    public UsuarioDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    @Override
    public List<Usuario> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement smtm = null;
        ResultSet rs = null;
        Usuario usuarioNuevo = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_SELECT);
            rs = smtm.executeQuery();
            while (rs.next()) {
                // persona = new Usuario( rs.getInt("id_persona"), rs.getString("nombre"), rs.getString("apellido"),rs.getString("email"),rs.getString("telefono"));

                // se extrae los atributos del resultado de la sentrencia sql 
                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");

                // se crea el objeto Usuario
                usuarioNuevo = new Usuario(idUsuario, usuario, password);

                // se agrega a la lista de Personas 
                usuarios.add(usuarioNuevo);
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
        return usuarios;
    }

    @Override
    public int insertar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement smtm = null;

        int registro = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_INSERT);
            smtm.setString(1, usuario.getUsuario());
            smtm.setString(2, usuario.getPassword());
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
    public int actualizarRegitro(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement smtm = null;
        int registro = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_UPDATE);
            smtm.setString(1, usuario.getUsuario());
            smtm.setString(2, usuario.getPassword());
            smtm.setInt(3, usuario.getIdUsuario());

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
    public int eliminarRegistro(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement smtm = null;
        int registro = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
            smtm = conn.prepareStatement(SQL_DELETE);
            smtm.setInt(1, usuario.getIdUsuario());

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
