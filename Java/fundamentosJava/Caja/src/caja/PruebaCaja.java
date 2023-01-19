package caja;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(2, 3, 6);
        System.out.println("el volumen de la caja 1: " + caja1.calcularVolumen());
        Caja caja2 = new Caja();
        System.out.println("el volumen de la caja 1: " + caja2.calcularVolumen());
        
    }
    
}
