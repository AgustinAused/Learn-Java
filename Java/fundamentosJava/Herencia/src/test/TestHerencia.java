
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("agustin", 10233.00);
        System.out.println("empleado1 = " + empleado1);
        
        var fecha = new Date();
        
        Cliente cliente1 = new Cliente(fecha, true,"agustin", 19, 'm', "estrada 1385");
        System.out.println( cliente1);
    }
}
