package tallerfinalJavaPunto1a15;

import java.util.Scanner;

/**TODO:Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 * @author Fernando Quiceno Gomez
 */
public class Punto7 {
    public static void main(String[] args) {

        double numeroPorTeclado;

        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("Ingresa el numero");
            numeroPorTeclado = entrada.nextDouble();

        }while(numeroPorTeclado<0);

        System.out.println("El numero ingresado es: "+numeroPorTeclado);

    }
}
