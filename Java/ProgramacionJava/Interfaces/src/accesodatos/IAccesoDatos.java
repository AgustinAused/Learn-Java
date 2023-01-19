
package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTROS = 10;
    
    
    public abstract void insertar();
    
    public abstract void listar();
    
    public abstract void actulizar();
    
    public abstract void eliminar();
}
