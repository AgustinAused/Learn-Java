package test;

import enume.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.LUNES);
//        imprimir(Dias.LUNES);
          System.out.println("el cuarto continente es: "+ Continentes.EUROPA);
          // aceder a los paises de la constante
          System.out.println("numero de paises en el 4to continente: "+ Continentes.EUROPA.getPaises());
          
          System.out.println("el 3er continente es: "+ Continentes.AMERICA);
          // aceder a los paises de la constante
          System.out.println("numero de paises en el 3er continente: "+ Continentes.AMERICA.getPaises());
    }
    private static void imprimir(Dias dias){
        switch (dias) {
            case LUNES:
                System.out.println("el dia es el primero de la semana");
                break;
            case MARTES:
                System.out.println("el dia es el segundo de la semana");
                break;
            case MIERCOLES:
                System.out.println("el dia es el tercero de la semana");
                break;
            case JUEVES:
                System.out.println("el dia es el cuarto de la semana");
                break;
            case VIERNES:
                System.out.println("el dia es el quinto de la semana");
                break;
            case SABADO:
                System.out.println("el dia es el sexto de la semana");
                break;
            case DOMINGO:
                System.out.println("el dia es el septimo de la semana");
                break;
        }
    }
}
