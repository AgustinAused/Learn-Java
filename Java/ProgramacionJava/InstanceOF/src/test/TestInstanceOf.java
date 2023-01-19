
package test;

import domain.*;


public class TestInstanceOf {
    public static void main(String[] args) {
        
        // creacion del oibjeto empleadpo
        Empleado empleado = new Empleado("agustin", 10000);
        determinarTipo(empleado);
        
        // creacion del objeto gerente
        empleado = new Gerente("Agustin",12342,"IT");
        determinarTipo(empleado);
    }
    // Polimorfismo
    // multiples formas en tiepo de ejecucion 
    public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente){
            System.out.println("El tipo es Gerente");
            // (Gerente) empleado).getDepartamento();
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        }else if(empleado instanceof Empleado){
            // Gerente gerente = (Gerente)empleado;
            // System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("El tipo es Empleado");
            empleado.getNombre();
        }else if(empleado instanceof Object){
            System.out.println("El tipo es Object");
            empleado.toString();
        } 
    }
    
}
