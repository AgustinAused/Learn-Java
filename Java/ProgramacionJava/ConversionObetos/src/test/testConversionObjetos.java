
package test;

import domain.*;

public class testConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("juan", 1200,TipoEscritura.MODERNO);
        // System.out.println("empleado = " + empleado);
        
        System.out.println(empleado.obtenerDetalles());
        // empleado.getTipoEscritura();
        
        //DownCasting
        Escritor escritor = (Escritor)empleado; // hace falta indicar el tipo de dato
        escritor.getTipoEscritura();
        //((Escritor) empleado).getTipoEscritura();
        
        // Upcasting
        Empleado empleado2 = escritor;// no necesita conversion  
        System.out.println("empleado2 = " + empleado2.obtenerDetalles());
        
    }
}
