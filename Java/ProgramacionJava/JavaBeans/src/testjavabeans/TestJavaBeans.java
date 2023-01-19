
package testjavabeans;

import domain.PersonaBean;

public class TestJavaBeans {

    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("agustin");
        persona.setApellido("aused");
        System.out.println("persona = " + persona);
        System.out.println("Nombre: "+ persona.getNombre() +", Apellido: "+ persona.getApellido());
    }
    
}
