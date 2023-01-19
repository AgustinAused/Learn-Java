package test;

import dominio.Persona;



public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("agustin", 20134.00, false);
        System.out.println("nombre de persona1: " + persona1.getNombre());
        persona1.setNombre("Agustin Aused");
//        System.out.println("nombre de persona1 cambiado" + persona1.getNombre());
//        System.out.println("el suledo de persona1 es: " + persona1.getSueldo());
//        System.out.println("esta eliminado persona1: " + persona1.isEliminado());
        System.out.println(persona1);
    }
}
