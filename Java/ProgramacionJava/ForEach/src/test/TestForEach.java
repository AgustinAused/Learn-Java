
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int ages[] = {1,3,2,4,5,6,7,8,9,0};
        // recorre tipo array
        for (int age : ages) {
            System.out.println("age = " + age);
        }
        
        
        
        
        
        // recorrer arreys de tipo object
        Persona personas[]= {new Persona("agustin"),new Persona("martina"),new Persona("juan"),new Persona("pilar"),new Persona("martin")};
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
            
        }
    }
}
