
package domain;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    
    
    // constructor 
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    
    @Override 
    // sobre escritura del metodo Obtener Detalles
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipo de escritura: " + this.tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + this.tipoEscritura + '}'+ super.toString();
    }
    
}
