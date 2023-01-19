
package test;

import java.util.*;

public class TestApiColeciones {

    public static void main(String[] args) {
        // listas 
        List miLista = new ArrayList(); // Creamos la lista
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
        System.out.println(miLista);
      
//        imprimir(miLista);
        
        // set
        Set miSet = new HashSet();// creamos el set
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
//        imprimir(miSet);
      

        // Map
        Map miMapa = new HashMap();
        miMapa.put("CO001", "juan");
        miMapa.put("CO002", "Agutina");
        miMapa.put("CO003", "maria");
        miMapa.put("CO004", "Agustin");
        
        String elemento = (String) miMapa.get("CO004");
        System.out.println("elemento = " + elemento);
        imprimir(miMapa.keySet());
    }
    public  static void imprimir( Collection object){
        System.out.println(object);
        // funcion lamnda / funcion flecha
        object.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        /*
        for (Object elemento : object) {
            System.out.println(elemento);
        }
        */
    }
    
}
