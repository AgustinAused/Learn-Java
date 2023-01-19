package fundamentos;
public class Flotantes {
    // tipos primitivos flotantes: float, double
    public static void main(String[] args) {
        //flotante 32bits
        float numeroFloat = (float) 123.50;
        System.out.println("numeroFlotante: " + numeroFloat);
        System.out.println("valor minimo: " + Float.MIN_VALUE);
        System.out.println("valro maximo: " + Float.MAX_VALUE);
        
        //double 64bits
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble: " + numeroDouble);
        System.out.println("valor minimo: " + Double.MIN_VALUE);
        System.out.println("valro maximo: " + Double.MAX_VALUE);
    }
    
    
}
