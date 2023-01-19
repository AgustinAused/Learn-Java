
package test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        // Clases Envolventes de tipos primitivos
        /*
        int - Integer
        long - Long 
        float - Float
        double - Double
        byte - Byte
        short - Short
        boolean - Boolean
        char - Character
        */
        
        
        
        Integer entero1 = 10;// AutoboxingS
        System.out.println("entero1 = " + entero1);
        System.out.println("con el metodo toString()");
        System.out.println("entero1 = " + entero1.toString());
        System.out.println("entero double = " + entero1.doubleValue());
        
        
        
        int entero2 = entero1;  //Unboxing 
        System.out.println("entero2 = " + entero2);
    }
}
