package tallerfinalJavaPunto1a15;

/**
 * TODO:Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
 * @author Fernando Quiceno Gomez
 */

public class Punto9 {
    public static void main(String[] args) {

        String textodelEjercicio = "La sonrisa sera la mejor arma contra la tristeza";
        String nuevaFrase = " y el odio, una sonrisa puede cambiar un mal dia";
        String textoNuevoGenerado = textodelEjercicio.replace('a','e');

        System.out.println(textoNuevoGenerado+nuevaFrase);



        }
    }

