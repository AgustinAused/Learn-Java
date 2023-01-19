package datos;

import domain.Usuario;
import java.sql.SQLException;
import java.util.List;

public interface IUsuarioDAO {

    List<Usuario> seleccionar()throws SQLException;

    int insertar(Usuario persona)throws SQLException;

    int actualizarRegitro(Usuario persona)throws SQLException;

    int eliminarRegistro(Usuario persona)throws SQLException;

}
