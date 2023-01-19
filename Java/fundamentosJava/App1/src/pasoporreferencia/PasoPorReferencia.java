package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        //created object
        Persona persona1 = new Persona();
        persona1.nombre = "Agustin";
        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1.apellido = "aused";
        cambiarValor(persona1);
        System.out.println("persona1 nombre = " + persona1.nombre);
    }
    public static void cambiarValor(Persona persona){
        persona.nombre = "jose";
   
    }
}
