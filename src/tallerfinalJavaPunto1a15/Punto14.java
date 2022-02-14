package tallerfinalJavaPunto1a15;

import java.util.Scanner;

/**
 * todo:Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
 */

public class Punto14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int NumeroIngresadoporUsuario = 0;

        System.out.println("Ingrese un numero");
        NumeroIngresadoporUsuario = entrada.nextInt();

        for(int i=NumeroIngresadoporUsuario;i<1000;i=i+2){
            System.out.println(i);
        }
    }
}
