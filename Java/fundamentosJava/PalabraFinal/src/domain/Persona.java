
package domain;

public class Persona {
    public static final int MI_CONSTANTE = 10;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static void imprimir(){
        System.out.println("mensaje de imprimir");
    }
}
