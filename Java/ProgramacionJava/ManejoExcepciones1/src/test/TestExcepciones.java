
package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int  resultado = 0;
        try{
            resultado =Aritmetica.division(9,resultado);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un Error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrio un error de tipo Exception");
//          e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Se reviso la divicion entre cero");
        }
        System.out.println("El resultado es: "+ resultado);
        
        
        
    }
    
}
