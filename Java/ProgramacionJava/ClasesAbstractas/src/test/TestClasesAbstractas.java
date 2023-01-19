
package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        // no se Puede crear objetos de las clases abstractas
        // FiguraGeometrica figura = new FiguraGeometrica();
        
        
        // creamos objetos de la clase hija de FiguraGeometrica
        FiguraGeometrica figura = new Rectangulo("rectangulo");
        System.out.println("figura = " + figura);
        figura.dibujar();
    }
    
}
