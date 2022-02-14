package tallerfinalJavaPunto1a15;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 * todo:Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
 */
public class Punto13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Date fecha = new Date();
        LocalTime horaActual = LocalTime.now();

        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY/MM/dd");

        System.out.println(formatoFecha.format(fecha)+" "+horaActual);

    }
}
