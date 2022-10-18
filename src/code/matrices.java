package code;

import javax.swing.*;
import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        //declarar matriz
        int matriz[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        //imprimir la matriz
        for (int i=0; i<3 ;i++){
            for(int j = 0;j<4;j++){
                System.out.print("|"+matriz[i][j]+"|");
            }
            System.out.println();
        }
        //matriz declarada sin la cantidad asignada
        int matrix[][],nFilas,nCols;
        Scanner entrada = new Scanner(System.in);
        nFilas = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero de filas"));//asignacion de filas
        nCols =Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero de columnas"));// asignacion de columnas
        matrix = new int [nFilas][nCols];
        //asignacion de valores a la matriz
        for (int x = 0; x<nFilas;x++){
            for (int f = 0; f<nCols;f++){
                System.out.println("digite el valor de la matriz ["+x+"]["+f+"]: ");
                matrix[x][f] = entrada.nextInt();
            }
        }
        for (int h=0; h<nFilas ;h++){
            for(int q = 0;q<nCols;q++){
                System.out.print("|"+matrix[h][q]+"|");
            }
            System.out.println();
        }
    }
}
