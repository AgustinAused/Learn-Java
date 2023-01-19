
package test;

import domain.*;


public class TestSobreEscritura {
    public static void main(String[] args) {
        
        // creacion del oibjeto empleadpo
        Empleado empleado = new Empleado("agustin", 10000);
//        System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        // creacion del objeto gerente
        empleado = new Gerente("Agustin",12342,"IT");
//        System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
    }
    // Polimorfismo
    // multiples formas en tiepo de ejecucion 
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalles);
    }
    
}
