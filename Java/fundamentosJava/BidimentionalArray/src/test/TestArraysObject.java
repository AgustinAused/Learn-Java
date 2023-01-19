
package test;

import domain.Persona;
public class TestArraysObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[3]; // por valor default es null
        //aceder a las personas 
        personas[0] = new Persona("Agustin");
        personas[1] = new Persona("Jose");
        personas[2] = new Persona("Maria");
        
        //imprimir los objetos 
        System.out.println("personas[1] = " + personas[1]);
        System.out.println("personas[2] = " + personas[2]);
        System.out.println("personas[0] = " + personas[0]);
        
        
        for (int i = 0; i < personas.length; i++){
            System.out.println("perosona ["+i+"] = " + personas[i]);
        }
        
        
    }
    
}
