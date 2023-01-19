package datos;


import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

public interface PersonaDao {

    List<PersonaDTO> seleccionar()throws SQLException;

    int insertar(PersonaDTO persona)throws SQLException;

    int actualizarRegitro(PersonaDTO persona)throws SQLException;

    int eliminarRegistro(PersonaDTO persona)throws SQLException;

}
