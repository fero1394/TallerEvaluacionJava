package tallerfinalJavaPunto1a15;

import java.util.Locale;
import java.util.Scanner;

/**TODO: Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
 * @autor Fernando Quiceno Gomez
 */
public class Punto8 {
    public static void main(String[] args) {
        String diadelasemana;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba un dia de la semana: ");

        diadelasemana = entrada.nextLine().toUpperCase();


        /**
         * El parametro ingresado por el usuario se captura y se convierte en mayuscula antes de entrar al switch
         */

        switch(diadelasemana){
            case "LUNES":
                System.out.println(diadelasemana+" Es un dia laboral");
                break;
            case "MARTES":
                System.out.println(diadelasemana+" Es un dia laboral");
                break;
            case "MIERCOLES":
                System.out.println(diadelasemana+" Es un dia laboral");
                break;
            case "JUEVES":
                System.out.println(diadelasemana+" Es un dia laboral");
                break;
            case "VIERNES":
                System.out.println(diadelasemana+" Es un dia laboral");
                break;
            case "SABADO":
                System.out.println(diadelasemana+" Es un dia NO LABORAL");
                break;
            case "DOMINGO":
                System.out.println(diadelasemana+" Es un dia NO laboral");
                break;
            default:
                System.out.println("El dia no existe");
        }
    }
}
