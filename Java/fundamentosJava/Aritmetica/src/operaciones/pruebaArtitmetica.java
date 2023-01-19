package operaciones;

public class pruebaArtitmetica {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 40;        
        
        System.out.println("b,a = " + b+ " , " +a);
        // clase Aritmetica objeto con constructor vacio
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a = " + aritmetica1.a);
        System.out.println("aritmetica1 b = " + aritmetica1.b);
        
        // clase Aritmetica objeto con constructor con argumentos
        Aritmetica aritmetica2 = new Aritmetica(3,6);
        System.out.println("aritmetica2 a = " + aritmetica2.a);
        System.out.println("aritmetica2 b = " + aritmetica2.b);
//        aritmetica1.a = 4;
//        aritmetica1.b = 5;
//        aritmetica1.sumar();
//        int resultado1 = aritmetica1.sumaConRetorno();
//        System.out.println("el valor del metodo de aritmetica con el return es " +resultado1 );
//        int resultadoConArgs = aritmetica1.sumarConArgumentos(resultado1, 5);
//        System.out.println("resultado de metodo usando argumentos = " + resultadoConArgs);
    }
     
}
 