package ar.com.peliculas.datos;

import ar.com.peliculas.domain.Pelicula;
import ar.com.peliculas.excepciones.*;
import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements IAccesoDatos {

    private String fileName;

    public AccesoDatosImpl() {
    }

    public AccesoDatosImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
//        var archivo = new File(this.fileName);
        var archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
//        var archivo = new File(this.fileName);
        var archivo = new File(nombreArchivo);
        List<Pelicula> lista = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while (lectura != null) {
                var pelicula = new Pelicula(lectura);
                lista.add(pelicula);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al Listar peliculas" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al Listar peliculas" + ex.getMessage());

        }

        return lista;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
//        File archivo = new File(this.fileName);
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.getName());
            salida.close();
            System.out.println("Se ha Cerrado el Archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al escribir el archivo" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al escribir el archivo" + ex.getMessage());

        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
//        var archivo = new File(this.fileName);
        var archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            String resultado = null;
            var indice = 1;
            while (lectura != null) {
                if (buscar != null && lectura.equalsIgnoreCase(buscar)) {
                    resultado = lectura;
                    return "Encontrado: " + resultado + ", encontrado en el indice: " + indice;
                }
                lectura = entrada.readLine();
                indice++;
            }
            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al buscar " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al buscar " + ex.getMessage());
        }
        return null;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
//        var archivo = new File(this.fileName);
        var archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el Archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("Excepcion al crear el archivo: " + ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
//        var archivo = new File(this.fileName);
        var archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("El fichero ha sido borrado satisfactoriamente");
        } else {
            System.out.println("El fichero no puede ser borrado");
        }

    }

}
