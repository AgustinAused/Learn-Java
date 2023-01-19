
package domain;
public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    static{
        System.out.println("Ejecutado el bloque estatico");
        // ++Persona.contadorPersona;
        // idPersona  = 10;
    }
    {
        System.out.println("Ejecutando el Bloque NO estatico");
        this.idPersona = ++Persona.contadorPersona;
    }
    
    public Persona(){
        System.out.println("Ejecuntando Constructor ");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
