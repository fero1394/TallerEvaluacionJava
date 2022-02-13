package tallerfinalJavaPunto1a15;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/** TODO:Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 * @author Fernando Quiceno Gomez
 */
public class Punto3 {
    public static void main(String[] args) {

        double radioCirculo;
        double areaCirculo;

        System.out.println("Programa para carcular el area de un circulo");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el radio del circulo");
        radioCirculo = entrada.nextDouble();

        areaCirculo = Math.PI*Math.pow(radioCirculo,2);

        System.out.println("El area del circulo es: "+areaCirculo);

    }
}
