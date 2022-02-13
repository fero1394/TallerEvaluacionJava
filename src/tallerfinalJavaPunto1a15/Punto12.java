package tallerfinalJavaPunto1a15;

import java.util.Scanner;

/**
 * todo:Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
 */

public class Punto12 {
    public static void main(String[] args) {

        /**
         * Se crean la variables primerPalabra y segundaPalabras donde se van almacenar las cadenas ingresasdas por el usuario
         * en la consola
         */

        String primerPalabra;
        String segundaPalabra;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la primer palabra");
        primerPalabra = entrada.nextLine();

        System.out.println("Ingresa la segunda palabra");
        segundaPalabra = entrada.nextLine();


        /**
         * En el siguiente condicional se comparan las dos palabras ingresadas por el usuario y si son iguales se imprime afirmando que son iguales
         * si son diferentes se ponen en mayusculas en las seguda palabra las letras que tienen de diferencia
         */

        if(primerPalabra.equalsIgnoreCase(segundaPalabra)){
            System.out.println("Las palabras son iguales");
        }
        else{
            System.out.println("Las palabras son distintas y su diferencia se van a denotar con mayusculas en la segunda palabra");
            System.out.println(primerPalabra.toLowerCase());

            for(int i=0;i<segundaPalabra.length();i++){
                char letraActualprimeraPalabra = primerPalabra.charAt(i);
                char letraActualsegundaPalabra = segundaPalabra.charAt(i);

                if(letraActualprimeraPalabra != letraActualsegundaPalabra){
                    System.out.print(String.valueOf(letraActualsegundaPalabra).toUpperCase());
                }
                else{
                    System.out.print(String.valueOf(letraActualsegundaPalabra).toLowerCase());
                }
            }
        }


    }
}
