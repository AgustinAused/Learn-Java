package fundamentos;
public class Banderas {
    public static void main(String[] args) {
        boolean varBoolean = true;
        
        if (varBoolean){
            System.out.println("la vandera es verdadera");
        }else{
            System.out.println("la bandera es falsa");
        }
        // ejercicio de practica 
        var edad = 10;
        var esAldulto = edad > 17;
        if (esAldulto){
            System.out.println("es adulto");            
        }else{
            System.out.println("no es adulto");
        }
    }
}
