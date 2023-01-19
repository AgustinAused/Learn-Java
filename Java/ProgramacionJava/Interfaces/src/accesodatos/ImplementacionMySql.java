
package accesodatos;

public class ImplementacionMySql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Inserto el elemento a la base de datos de MySql");
    }

    @Override
    public void listar() {
        System.out.println("listado de MySql");
    }

    @Override
    public void actulizar() {
        System.out.println("Se ha actulizado la base de datos de MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino el Producto de MySqlS");
    }
    
    
    
}
