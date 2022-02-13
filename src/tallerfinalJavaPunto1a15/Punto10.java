package tallerfinalJavaPunto1a15;

import java.util.Scanner;

/**TODO:Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
 * @autor Fernando Quiceno Gomez
 */
public class Punto10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String fraseIngresaUsuario;
        String fraseSinEspacios;

        System.out.println("Ingresa una frase");

        fraseIngresaUsuario=entrada.nextLine();

        fraseSinEspacios = fraseIngresaUsuario.replaceAll(" ","");

        System.out.println(fraseSinEspacios);


    }
}
