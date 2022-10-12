package code;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float numero1, numero2,suma, resta,div,multi,resto;
        System.out.println("digite dos numeros: ");
        numero2 = entrada.nextFloat();
        numero1 = entrada.nextFloat();

        //operations
        suma = numero2 + numero1;
        System.out.println("la suma es: "+ suma);
        resta = numero1 - numero2;
        System.out.println("la resta es: "+ resta);
        multi = numero1 * numero2;
        System.out.println("la multiplicacion es: "+ multi);
        div = numero2 / numero1;
        System.out.println("la division es: "+ div);
        resto = numero1 % numero2;
        System.out.println("el resto es: "+ resto);
        // operadores combinados
        suma += 5;
        System.out.println("la suma con op combinado es: "+ suma);
        resta -= 4;
        System.out.println("la resta conmbinada es: "+ resta);
        multi *=  numero2;
        System.out.println("la multiplicacion combinada es: "+ multi);
        div /=  numero1;
        System.out.println("la division combinada es: "+ div);
        resto %= numero2;
        System.out.println("el resto combinado es: "+ resto);







    }
}
