package code;

public class Arrays {
    public static void main(String[] args) {
        //declaracion de arrays
        String[] names = {"agustin","jose","maria","carla","martina","juan","catalina","benjamin","franco","josefina","nahuel","mili"};
        int[] age = {18,34,23,13,85,34,18,14,45,32,23,52};
        System.out.println("el primer valor de ambas listas es "+names[0]+" y tiene "+age[0]); // imprimir los valores de la lista
        System.out.println("el largo del Array es "+names.length);//imprimis en consola la cantida de elementos que tiene una lsita
        //manipulacion de arrays
        for (int i = 0;i < names.length; i++){
            System.out.println(names[i]+" y tiene "+age[i]);
        }
        for (String i  : names) {
            System.out.println(i);
        }


    }
}
