package ar.com.peliculas.datos;

import ar.com.peliculas.domain.Pelicula;
import ar.com.peliculas.excepciones.*;
import java.util.List;

public interface IAccesoDatos {

    boolean existe(String nombreRecurso)throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso)throws LecturaDatosEx;

    void escribir(Pelicula pelicula,String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String buscar,String nombreRecurso) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
