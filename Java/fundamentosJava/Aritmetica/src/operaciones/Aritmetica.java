package operaciones;

public class Aritmetica {
    
    // atributos
    int a;
    int b;
        
    
    
    
    //constructor vacio
    public Aritmetica(){
        System.out.println("ejecutando constructor...");
    }
    // sobre carga deconstructores
    public Aritmetica(int args1, int args2){
        this.a = args1;
        this.b = args2;
        System.out.println("ejecutando constructor con argumentos...");
        
    }
    //metodos 
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    } 
    public int sumaConRetorno(){
        return this.a + this.b;
    }
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b; 
        return this.sumaConRetorno();
    }
}
