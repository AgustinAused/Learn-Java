
package ar.com.gm.ventas.test;

import ar.com.gm.ventas.*;



public class VentasTest {

    public static void main(String[] args) {
        Producto producto1 = new Producto("remera",100.00);
        Producto producto2 = new Producto("pantalon",190.00);
        
        // crear el object Orden 
        Orden orden1 = new Orden();
        // agregar los productos(object) a la orden
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto1);
        // mostrar los productos cargados en la orden
        orden1.mostrarOrden();
    }
    
}
