
package presentacion;

import ar.com.peluculas.negocio.*;
import java.util.Scanner;

public class CatalogoPresentacion {
    public static void main(String[] args) {
        var opcion = -1;
        String nombrePelicula;
        var scaner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        while ( opcion != 0 ) {
            System.out.println("""
                               Elegir una opcion
                               1) Crear Archivo 
                               2) Agregar pelicula 
                               3) Buscar Pelicula 
                               4) Listar Peliculas 
                               0) Salir Del Programa 
                               """);
            opcion = Integer.parseInt(scaner.nextLine());
            switch (opcion) {
                case 1 -> catalogo.iniciarCatalogo();
                case 2 -> {
                    System.out.println("Ingresar nombre de la Pelicula");
                    nombrePelicula = scaner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                }
                case 3 -> {
                    System.out.println("Ingresar nombre de la Pelicula a buscar");
                    nombrePelicula = scaner.nextLine();
                    catalogo.buscarPeliculas(nombrePelicula);
                }
                case 4 -> catalogo.listarPeliculas();
                case 0 -> System.out.println("Se Termino la ejecucion");
                default -> System.out.println("Opcion no valida");
                    
            }
            
         
        }
    }
}
