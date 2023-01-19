package test;

import domain.Persona;

public class PersonaPrueba {
    
    
    
    private int varia = 10 ;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Agustin");
        System.out.println("persona1" + persona1);
        Persona persona2 = new Persona("jose");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
    }
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    public int getVaria(){
        return this.varia;
    }
}
