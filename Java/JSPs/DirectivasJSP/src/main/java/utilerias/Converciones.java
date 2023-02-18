
package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Converciones {
    private static final String FORMATO_FECHA = "dd-MM-yyyy";
    
    
    // Convierte un objeto Date a String (Fecha)
    public static String format(Date fecha){
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
    // Convierte un objeto String a String(Fecha)
    public static String format(String fecha){
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
}
