
package paquete;

import paquete.*;


public class TestModificadoresAcceso {
    public static void main(String[] args) {
        // modificador de acceso publico se puedeacceder de cualquier clase 
        System.out.println("Clase 1(Public)");
        Clase1  clase1 = new Clase1();
        System.out.println("clase1.atributoPublico = " + clase1.atributoPublico);
        clase1.methoodoPublico();
        
        
        System.out.println("");
        

        // modificador de acceso protected
        System.out.println("Clase 2 (protected)");
        Clase2  clase2 = new Clase2("hola"); // no se puede acceder desde otro paquete pero si desde otra calse hijo
        // Clase Hija
        ClaseHijaProtec claseHija2 = new ClaseHijaProtec();
        System.out.println("claseHija = " + claseHija2);
        
        
        System.out.println("");
        
        
        //modificador de acceso Default
        System.out.println("Clase 3 (Default)"); // Solo se puede cuanSSdo esta dentro del mismmo paquete si no no funciona
        Clase3 clase3 = new Clase3();
        clase3.atributoDefault = "Cambio desde Test";
        System.out.println("clase3.atributoDefault = " + clase3.atributoDefault);
        clase3.metodoDefault();
        
        System.out.println("");
        
        System.out.println("Clase 4 (private)"); // Solo se puede cuanSSdo esta dentro del mismmo paquete si no no funciona
        Clase4 clase4 = new Clase4("agus");
        clase4.setAtibutoPrivado("Cambio desde Test con methodo set");
        System.out.println("Atibuto Privado  = " + clase4.getAtibutoPrivado());
        
    }
}
