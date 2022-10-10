package code;

import java.util.Scanner;

public class Ingreso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //objeto escaner
        int numero;
        System.out.println("Digite unb  numero:");
        numero = entrada.nextInt();
        System.out.println("el numero digitado es: "+numero);

        float num;
        System.out.println("Digite unb  numero:");
        num = entrada.nextFloat();
        System.out.println("el numero digitado es: "+num);

        double num1;
        System.out.println("Digite unb  numero:");
        num1 = entrada.nextDouble();
        System.out.println("el numero digitado es: "+num1);

        String cadena;
        System.out.println("ingrese una cadena de texto");
        cadena = entrada.next();// guarda hasta encopntrar un espacio
        System.out.println(cadena);

        String cadena1;
        System.out.println("ingrese una cadena de texto");
        cadena1 = entrada.nextLine();// guarda con espacio
        System.out.println(cadena1);

        char letra;
        System.out.println("ingrese un caracter");
        letra = entrada.next().charAt(0);
        System.out.println("la letra es: "+letra);
    }


}
