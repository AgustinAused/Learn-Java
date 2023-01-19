
package accesodatos;

public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertado desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listado desde Oracle");
    }

    @Override
    public void actulizar() {
        System.out.println("Actualizado desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminado desde Oracle");
    }

}
