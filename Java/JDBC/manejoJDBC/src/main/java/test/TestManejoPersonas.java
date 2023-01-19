
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        

        // insertar nuevas personas
//        Persona personaNueva = new Persona( "martina", "paul", "mpaul@gmail.com", "1198765432");
//        personaDao.insertar(personaNueva);
        
        
        //actulaizar registro
        var personaActualizar = new Persona(9, "martina", "paul", "martu.paul@gmail.com", "1198765432");
        personaDao.actualizarRegitro(personaActualizar);
        
        
        // eliminar registro
//        var personaEliminar = new Persona(7);
//        personaDao.eliminarRegistro(personaEliminar);
                
        
        // listar objetos en consola 
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach((personaPrint) -> {
            System.out.println("persona = " + personaPrint);
        });
        
    }
}
