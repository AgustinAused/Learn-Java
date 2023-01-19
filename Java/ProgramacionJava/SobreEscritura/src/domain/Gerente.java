
package domain;

public class Gerente extends Empleado{
    private String departamento;
            
            
            
    public Gerente(String nombre, double sueldo, String depa) {
        super(nombre, sueldo);
        this.departamento = depa;
    }
    

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", el depaprtamentos es: "+this.departamento;
    }

    

    
}
