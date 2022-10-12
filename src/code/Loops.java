package code;


import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int numero, i ;
        Scanner entrada = new Scanner(System.in);
        System.out.print("digete un numero entre 5 y 0");
        numero = entrada.nextInt();
        while (0 < numero && numero > 5){
            System.out.print("digete un numero que este entre 0 y 5");
            numero = entrada.nextInt();
        }
        while(numero <= 10 ) {
            System.out.println("el numero es: "+numero);
            numero++;
        }
        System.out.println("entro al bucle do while");
        do {
            System.out.println("el numero es: "+numero);
            numero++;
        }while(numero < 20 );
        for( i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}
