package code;

import javax.swing.*;

public class Condicionales {
    public static void main(String[] args) {
        int numero, dato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingreesar un numero"));
        if (numero == dato){
            JOptionPane.showMessageDialog(null, "numero ingresado es el mismo que el dato");
        }else{
            JOptionPane.showMessageDialog(null, "el numero ingresado es diferente que el dato");
        }
        switch (numero){
            case 1:JOptionPane.showMessageDialog(null ,"el numero digitado es 1");
                break;
            case 2:JOptionPane.showMessageDialog(null ,"el numero digitado es 2");
                break;
            case 3:JOptionPane.showMessageDialog(null ,"el numero digitado es 3");
                break;
            case 4:JOptionPane.showMessageDialog(null ,"el numero digitado es 4");
                break;
            case 5:JOptionPane.showMessageDialog(null ,"el numero digitado es 5");
                break;
            default:JOptionPane.showMessageDialog(null,"el numero es mayor que 5");
        }
    }
}
