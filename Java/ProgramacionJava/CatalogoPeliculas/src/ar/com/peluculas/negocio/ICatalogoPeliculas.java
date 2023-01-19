package ar.com.peluculas.negocio;

public interface ICatalogoPeliculas {

    String RECURSO = "pelicula.txt";

    void agregarPelicula(String nombrePelicula);

    void listarPeliculas();

    void buscarPeliculas(String nombrePelicula);

    void iniciarCatalogo();

}
