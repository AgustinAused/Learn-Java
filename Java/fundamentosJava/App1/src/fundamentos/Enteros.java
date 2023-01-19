
package fundamentos;
public class Enteros {
    public static void main(String[] args) {
        //tipos de datos enteros
        
        //numero mas pequeños 
        byte numeroByte = 10;
        System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE);
        System.out.println("vallor maximo de un byte : " + Byte.MAX_VALUE);
        System.out.println("el valor del short : "+ numeroByte);
        
        short numeroShort = 10;
        System.out.println("numero maximo de un short: "+ Short.MAX_VALUE);
        System.out.println("numero minimo de un short: "+ Short.MIN_VALUE);
        System.out.println("el valor de numero short: " + numeroShort);
        
        int numeroInt = (int)2147483648L;
        System.out.println("valor minimo: " + Integer.MIN_VALUE);
        System.out.println("valor maximo: " + Integer.MAX_VALUE);
        System.out.println("el valor de numero integer: " + numeroInt);
        
        //numero mas grannde en Java
        long numeroLong = 9223372036854775807L;
        System.out.println("valor minimo: " + Long.MIN_VALUE);
        System.out.println("valor maximo: " + Long.MAX_VALUE);
        System.out.println("el valor de numero integer: " + numeroLong);
        
        
        
        
        //convetir string a int
        var edad = Integer.parseInt("20");
//      var edad = "20";
        System.out.println("edad = " + (edad + 1));
        
        
    }
    
}
