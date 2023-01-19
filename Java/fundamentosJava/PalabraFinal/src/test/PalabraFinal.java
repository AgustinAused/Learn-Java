package test;

import domain.Persona;

public class PalabraFinal {

    public static void main(String[] args) {
        final int valor = 10;
        System.out.println("valor = " + valor);
        // valor = 5; no se puede ya que al sert una copnstate no se puede sobre escribir la variable 

        System.out.println("Persona.MI_CONSTATE = " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        // persona1 = new Persona(); || nos e puede porque persona1 ya esta definida 
        System.out.println("persona1.nombre = " + persona1.getNombre());
        // cambio de valore null a Agustin
        persona1.setNombre("Agutin");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        
        // cambio de nombre agustin a jose 
        persona1.setNombre("Jose");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        
        
    }
    
}
