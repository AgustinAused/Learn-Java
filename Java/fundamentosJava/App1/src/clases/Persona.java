
package clases;
public class Persona {
//    atributos de la clase
    public String nombre; //no buena paractica colocar la palabra public
    public String apellido; 
    
    public void desplegarInformacion(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }
}
    