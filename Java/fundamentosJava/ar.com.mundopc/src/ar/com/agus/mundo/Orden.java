
package ar.com.agus.mundo;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 15;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora [Orden.MAX_COMPUTADORAS];
    }
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora ;
        }else{
            System.out.println("se ha superado el maximo de productos: "+ Orden.MAX_COMPUTADORAS );
        }
    }
    public void mostrarOrden(){
        System.out.println("id Orden: "+ this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
