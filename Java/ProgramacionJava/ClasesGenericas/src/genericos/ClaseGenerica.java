
package genericos;

public class ClaseGenerica <T> {
    
    private T objeto;
    
    public ClaseGenerica(T objecto){
        this.objeto = objecto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + this.objeto.getClass().getSimpleName());
    }
}
