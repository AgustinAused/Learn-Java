package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x : " + x);
        
        cambioValor(x);
    }
    public static void cambioValor(int args1){
        System.out.println("args1 = " + args1);
        args1 = 15;
    }
      
}
