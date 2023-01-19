
package test;

import java.util.*;

public class TestApiColecionesGenericas {

    public static void main(String[] args) {
        // listas 
        List<String> miLista = new ArrayList<>(); // Creamos la lista
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
        
        String elemento = miLista.get(5);
        System.out.println("elemento = " + elemento);
        System.out.println("");
        System.out.println("Imprimir List: ");
        imprimir(miLista);
        
        // set
        Set<String> miSet = new HashSet<>();// creamos el set
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
        System.out.println("");
        System.out.println("Imprimir Set: ");
        imprimir(miSet);
      

        // Map
        Map<String,String> miMapa = new HashMap<>();
        miMapa.put("CO001", "Juan");
        miMapa.put("CO002", "Agutina");
        miMapa.put("CO002", "Martina");
        miMapa.put("CO003", "Maria");
        miMapa.put("CO004", "Agustin");
        
        System.out.println("");
        System.out.println("Imprimir Map: ");
        String elemento1 = miMapa.get("CO004");
        System.out.println("elemento = " + elemento1);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    public  static void imprimir( Collection<String> object){
        System.out.println(object); // imprime la collecion completa
        // funcion lamnda / funcion flecha
//        object.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
        
        for (String elemento : object) {
            System.out.println(elemento);
        }
        
    }
    
}
