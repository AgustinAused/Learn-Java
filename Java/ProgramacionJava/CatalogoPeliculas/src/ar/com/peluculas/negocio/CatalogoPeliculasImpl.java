package ar.com.peluculas.negocio;

// imports
import ar.com.peliculas.datos.AccesoDatosImpl;
import ar.com.peliculas.datos.IAccesoDatos;
import ar.com.peliculas.domain.Pelicula;
import ar.com.peliculas.excepciones.AccesoDatosEx;
import ar.com.peliculas.excepciones.EscrituraDatosEx;
import ar.com.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
//        this.datos = new AccesoDatosImpl(RECURSO);
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        var pelicula = new Pelicula(nombrePelicula);
        var anexar = false;
        try {
            anexar = this.datos.existe(RECURSO);
            this.datos.escribir(pelicula, RECURSO, anexar);
        } catch (EscrituraDatosEx ex) {
            ex.printStackTrace(System.out);
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public void listarPeliculas() {
        try {
            var listado = this.datos.listar(RECURSO);
            for (Pelicula pelicula : listado) {
                System.out.println("pelicula = " + pelicula.getName());
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de Acceso datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPeliculas(String nombrePelicula) {
        try {
            var resultado = this.datos.buscar(nombrePelicula, RECURSO);
            System.out.println("El resultado de la busqueda es: " + resultado);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de Acceso datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void iniciarCatalogo() {
        try {
            if (this.datos.existe(RECURSO)) {
                System.out.println("El archivo ya existe");
                System.out.println("Se eliminara y se volvera a crear");
                this.datos.borrar(RECURSO);
                this.datos.crear(RECURSO);
            } else {
                this.datos.crear(RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar el Catalogo de peliculas");
            ex.printStackTrace(System.out);
        }

    }

}
