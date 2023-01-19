
package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan",4000);
        Empleado empleado2 = new Empleado("Juan",4000);
        
        
        if (empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("Tienen diferente referencia en memoria");
        }
        // valida si son iguales
        boolean detalle = empleado1.equals(empleado2);
        System.out.println(detalle);
        
        // comprueba si los hash son iguales 
        if (empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("los Contenidos son iguales");
       
        }else{
            System.out.println("los constnidos son diferentes");
        }
        
    }
}
