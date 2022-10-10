package code;
public class Datos {
        //dates primitives
        //enters
        public static void main(String[] args) {
        byte entero = 12;//byte (-128 a 127)
        short x = 2899;//short (-32768 a 32767)
        int num = 2000000000;//int (2 mil mill)
        long num2 = 2000000000 ;//long()
        System.out.println("numero byte es: " + entero);
        System.out.println("numero short es: "+ x);
        System.out.println("numero integer es: "+ num);
        System.out.println("numero long es: "+ num2);

        //flotations(decimals)
        float dec = 3.45f;
        System.out.println("el numero decimal es: "+dec);
        //character
        char caracter = 'a';
        System.out.println("el character es:" + caracter);
        //booleans
        boolean decicion = true;
        System.out.println("el boleano es:" + decicion);
        //No primitives dates

        Integer inv = null; //valor numerico no primitivo
        System.out.println("el valor es:" + inv);

        String cad = "hola como estas"; //cadena de caracteres
        System.out.println(cad);

        final int cons = 10; // declaracion de constantes

    }
}
