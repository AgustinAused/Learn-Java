package test;

import domain.Persona;

public class TestBiArray {
    public static void main(String[] args) {
        // inicializacion de una matriz 
        int ages[][] = new int[3][3];
        int n = 0;
        for (int i = 0; i < ages.length; i++){
            for (int j = 0; j < ages[i].length; j++){
                ages[i][j] = ++n;
                System.out.println("ages["+ i +"]["+ j +"] = " + ages[i][j]);
            }
        }
        int names[][]= {{1,2,3},{4,5,6},{7,8,9}};// sintaxis simplificada
        for (int i = 0; i < names.length; i++) {
           for (int h = 0; h<names[i].length; h++){
               System.out.println("names["+ i +"]["+ h +"] = " + ages[i][h]);
           } 
        }
        // System.out.println("ages = " + ages);
        Persona personas[][] = new Persona[2][2];
        imprimir(personas);
    }
    public static void imprimir(Object personas[][]){
        for (int i = 0; i < personas.length;i++){
            for (int j = 0; j< personas[i].length;j++){
                personas[i][j] = new Persona("Agustin " + i +" "+ j );
                System.out.println("personas[" + i + "][" + j + "] = " + personas[i][j]);
            }
        }
    }
}
