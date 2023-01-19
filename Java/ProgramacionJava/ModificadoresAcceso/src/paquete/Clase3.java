
package paquete;

class Clase3 {
    String atributoDefault = "Soy un atributo protegido";
    
    Clase3(){ // no se puede accedor desde otro paquete 
        System.out.println("Constructor Default");
    }
    
    void metodoDefault(){
        System.out.println("Metodo Default");
    }
}
