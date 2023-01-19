package paquete;

public class Clase2 {
    protected String atributoProtected = "Soy un atributo protegido";
    
    public Clase2( String arg){
        System.out.println("Constructor Publico");
    }
    
    protected Clase2(){ // no se puede accedor desde otro paquete 
        System.out.println("Constructor Protegido(protected)");
    }
    
    
    protected void metodoProtecte(){
        System.out.println("Metodo protegido(protected)");
    }
}
