
package test;


import accesodatos.*;

public class TestInterfaces {

    public static void main(String[] args) {
        
        
        // IAccesoDatos datos = new IAccesoDatos(); no se puede 

        
        // haciendo Upcaisting 
        // asignadole una "clase" mas genreica para no tener que coonvertir la variable 
        IAccesoDatos implementacion = new ImplementacionMySql();
        
        implementacion.insertar();
        implementacion.actulizar();
        imprimir(implementacion);
        
        
        // asignadole un nuevo objeto a la variable sin tener que convertir y mas generico 
        implementacion = new ImplementacionOracle();
        implementacion.insertar();
        implementacion.actulizar();
        imprimir(implementacion);
        
        
    }
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
    
}
