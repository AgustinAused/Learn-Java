
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var valor = Operaciones.sumar(5, 3);
        System.out.println("valor = " + valor);
        var valor2 =Operaciones.sumar(2.0, 4.0);
        System.out.println("valor2 = " + valor2);
        var valor3 = Operaciones.sumar(3, 5L);
        System.out.println("valor3 = " + valor3);
    }
}
