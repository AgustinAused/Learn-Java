package code;

import javax.swing.JOptionPane;

public class Ingreso1 {
    public static void main(String[] args) {
        String cad ;
        int num;
        char letra;
        double decimal;
        cad = JOptionPane.showInputDialog("ingrese una cadena de texto");
        System.out.println(cad);
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        System.out.println(num);
        letra = JOptionPane.showInputDialog("ingresar un caracter").charAt(0);
        System.out.println(letra);
        decimal =Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero decimal"));
        System.out.println(decimal);
        JOptionPane.showInternalMessageDialog(null,"lac cadena es: "+ cad);
        JOptionPane.showInternalMessageDialog(null,"el numero es: "+ num);
        JOptionPane.showInternalMessageDialog(null,"el caracter es: "+letra);
        JOptionPane.showInternalMessageDialog(null,"el nuemro decimal es: "+decimal);

    }
}
