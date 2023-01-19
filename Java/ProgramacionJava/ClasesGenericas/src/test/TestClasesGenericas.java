
package test;

import genericos.ClaseGenerica;

public class TestClasesGenericas {

    public static void main(String[] args) {
        // Creacion de clase generica (Integer)
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        //Creacion de clase generica (String)
        ClaseGenerica<String> objectoString = new ClaseGenerica("Agustin");
        objectoString.obtenerTipo();
    }
    
}
