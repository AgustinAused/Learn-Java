
package fundamentos;

import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        String texto="hola mundo"; 
        System.out.println(texto);
        //modificacion de variale
        texto = "como estas";
        System.out.println(texto);        
        
        
        
        //var - inferencia de tipos en java
        var miVariable = 20;
        System.out.println(miVariable);
        Scanner consola = new Scanner(System.in);
        var miVariableCadena = consola.nextLine();
        System.out.println(miVariableCadena);
        var titulo = "yo ssoy es titulo xdxdxdxd \'" + miVariableCadena +"\'";
        System.out.println("titulo = " + titulo);
        
        
        //ejercicio
        Scanner Lectura = new Scanner(System.in);
        var titulo1 = Lectura.nextLine();
        var autor = Lectura.nextLine();
        System.out.println(titulo+" fue escrito por "+autor);
    }
}
