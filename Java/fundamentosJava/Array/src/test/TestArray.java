
package test;

public class TestArray {

    public static void main(String[] args) {
        int ages [] = new int[3] ; //  no se puede manejar arreglos de forma dinamica ||  los arrays son de tipo object y =hayque definirlos 
        System.out.println("ages = " + ages);
        // definir un arreglos 
        String frutas[]= {"Naranja", "Manzana","Banana", "Uva"};// sintaxis resumida   
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas[" + i + "] = " + frutas[i]);
        }
        // modificar los valor de los elementos del Array
        ages[0] =4;
        ages[1] =2;
        ages[2] =5;
        
        
        
        // diferentes formas de recorrer Arrays
        for (int o = 0; o < ages.length ; o++){
            System.out.println("ages[" + o + "]= " + ages[o]);
        }
        for (int i : ages) {
            System.out.println("i = " + i);
        }
    }
    
}
