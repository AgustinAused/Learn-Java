
package test;

public class TestArgumentosVarables {
    public static void main(String[] args) {
//        pasamos por , la cantida de varables que queremos a la funcion y esta lo trata como un array  
        imprimirNums(2,4,3,1,4,6,7,8,9);
        variosParametros("agustin", 1,2,4,5,5,7,8,9,0);
    }
    private static void variosParametros(String nombre, int... nums){
        System.out.println("nombre = " + nombre);
        imprimirNums(nums);
    }
    private static void imprimirNums(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
        }
    }
}
