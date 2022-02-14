package tallerfinalJavaPunto1a15;

import java.util.Scanner;

/**
 * todo:Hacer un programa que muestre el siguiente menú de opciones
 * ****** GESTION CINEMATOGRÁFICA ********
 * 1-NUEVO ACTOR
 * 2-BUSCAR ACTOR
 * 3-ELIMINAR ACTOR
 * 4-MODIFICAR ACTOR
 * 5-VER TODOS LOS ACTORES
 * 6- VER PELICULAS DE LOS ACTORES
 *
 * 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
 * 8-SALIR
 *
 *
 * EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
 * PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
 */
public class Punto15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcionDelUsuario;
        System.out.println("******GESTION CINEMATOGRAFICA********\n"+
                "1-NUEVO ACTOR\n"+
                "2-BUSCAR ACTOR\n"+
                "3-ELIMINAR ACTOR\n"+
                "4-MODIFICAR ACTOR\n"+
                "5-VER TODOS LOS ACTORES\n"+
                "6-VER PELICULAS DE LOS ACTORES\n"+
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n"+
                "8-SALIR\n");

        do{
            System.out.print("Ingrese una de las opciones: ");
            opcionDelUsuario = entrada.nextInt();

            if(opcionDelUsuario<=0 || opcionDelUsuario>8) {
                System.out.println("OPCION INCORRECTA");
            }
        }
        while(opcionDelUsuario!=8);
    }
}
