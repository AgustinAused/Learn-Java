
package ar.com.agus.mundopc.test;
import ar.com.agus.mundo.*;
public class TestOrden {
    public static void main(String[] args) {
        // creando los objetos de para la computadora 
        // computadora 1
        Teclado teclado1 = new Teclado("teclado","hyperx");
        Raton raton1 = new Raton("mouse","logitech");
        Monitor monitor1 = new Monitor("lg",24.00);
        // compu 2
        Teclado teclado2 = new Teclado("teclado","logitech");
        Raton raton2 = new Raton("mouse","hyperx");
        Monitor monitor2 = new Monitor("samsung",27.00);
        // compu 3
        Teclado teclado3 = new Teclado("teclado","hyperx");
        Raton raton3 = new Raton("mouse","logitech");
        Monitor monitor3 = new Monitor("asus",27.00);
        

        // creando los objetos computadoras 
        Computadora compu1 = new Computadora("CO001",monitor1, teclado1, raton1);
        Computadora compu2 = new Computadora("CO002",monitor2, teclado2, raton2);
        Computadora compu3 = new Computadora("CO003",monitor3, teclado3, raton3);
        
        // creando la orden
        Orden orden1 = new Orden();
        // agregando Compus(Objetc) a la orden
        orden1.agregarComputadora(compu3);
        orden1.agregarComputadora(compu2);
        orden1.agregarComputadora(compu1);
        
        // mostrando la orden(los objetossd e la orden)
        orden1.mostrarOrden();
        
        
        
    }
}
