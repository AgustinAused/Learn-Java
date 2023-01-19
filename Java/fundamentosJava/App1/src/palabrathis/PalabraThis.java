package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Agustin", "Aused");
        System.out.println("lugar donde se encuentra persona1 = " + persona1);
        System.out.println("persona1.nombre = " + persona1.nombre);
        System.out.println("persona1.apellido = " + persona1.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        // super(); llamada al constructor de la clase padre (object)
        this.apellido = apellido;
        this.nombre = nombre;
        System.out.println("objeto personausando this :" + this);
        new Imprimir().imprimir(this);
    }
} 
class Imprimir{
    public Imprimir(){
        super(); // constructor de la clase padre
    }
    public void imprimir(Persona persona){
        System.out.println("persona desde la clase imprimir = " + persona);
        System.out.println("imprimir del objeto actual(this) clase imprimir " + this);
         
    }
}