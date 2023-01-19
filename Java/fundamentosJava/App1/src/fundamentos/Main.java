
package fundamentos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Consola = new Scanner(System.in);
        //ejercio de libro 
        //ingresar nombre
        System.out.println("Proporciona el nombre:");
        var nombre = Consola.nextLine();
        
        //ingresar id
        System.out.println("Proporciona el id:");
        var id =Integer.parseInt(Consola.nextLine());
        
        //ingresar precio
        System.out.println("Proporciona el precio:");
        var precio = Double.parseDouble(Consola.nextLine()); 
        
        //envio gratis
        System.out.println("Proporciona el envio gratuito:");
        var envio = Boolean.parseBoolean(Consola.nextLine());
        
        System.out.println(nombre + " #" + id );
        System.out.println("precio: " + precio);
        System.out.println("envio: " + envio);
        
        
        
        //calcular rectangulo
        //ingresar alto
        System.out.println("Proporciona el alto:");
        var alto = Integer.parseInt(Consola.nextLine());
    
        // ingresar ancho
        System.out.println("Proporciona el ancho:");
        var ancho = Integer.parseInt(Consola.nextLine());

        // calculo de area
        var area = alto * ancho;
        System.out.println("area: " + area);
        
        // calculo de perimetro 
        var perimitro = (alto + ancho )* 2;
        System.out.println("perimitro: " + perimitro);
        
        
        // ejercicio mayor entre dos numeros
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(Consola.nextLine());
        
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(Consola.nextLine());
        
        if (numero1 > numero2){System.out.println("El numero mayor es: " + numero1 );}else{System.out.println("El numero mayor es:\n" + numero2 );}
        
        
        //sistema de calificacion 
        System.out.println("Proporciona un valor entre 0 y 10:");
        var nota = Integer.parseInt(Consola.nextLine());
        if (nota >= 9 && nota <= 10 )
            System.out.println("A");
        else if(nota >= 8 && nota < 9)
            System.out.println("B");
        else if (nota >= 7 && nota < 8)
            System.out.println("C");
        else if(nota >= 6 && nota < 7)
            System.out.println("D");
        else if (nota >= 0 && nota < 6)
            System.out.println("F");
        else
            System.out.println("valor desconocido");
                
        
        
    }
}
