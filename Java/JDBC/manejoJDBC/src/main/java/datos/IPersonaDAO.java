package datos;

import domain.Persona;
import java.util.List;

public interface IPersonaDAO {

    List<Persona> seleccionar();

    int insertar(Persona persona);

    int actualizarRegitro(Persona persona);

    int eliminarRegistro(Persona persona);

}
