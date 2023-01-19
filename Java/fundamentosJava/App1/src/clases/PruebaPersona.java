
package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        // objeto 1
         Persona persona1;
         persona1 = new Persona();
         persona1.nombre = "Agustin";
         persona1.apellido = "Aused";
         persona1.desplegarInformacion();
         System.out.println("persona1 = " + persona1);
         // objeto 2 
         Persona persona2 = new Persona();
         persona2.nombre = "Martina";
         persona2.apellido = "Gonzales";
         persona2.desplegarInformacion();
         System.out.println("persona2 = " + persona2);
    }
}
