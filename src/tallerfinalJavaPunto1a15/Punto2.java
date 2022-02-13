package tallerfinalJavaPunto1a15;

import java.util.Scanner;

/**TODO:Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
 * @author Fernando Quiceno Gomez*/

public class Punto2 {
    public static void main(String[] args) {

        /**
         * @param variable1 numero para comparar con variable2 (mayor, menor o igual)
         * @param variable2 numero para comparar con varible1 (mayor, menor o igual)
         */
        double variable1 ;
        double variable2 ;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero a comparar");
        variable1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo numero a comparar");
        variable2 = entrada.nextDouble();

        entrada.close();

        if(variable1 < variable2){
            System.out.println("El numero "+variable1+" es MENOR que "+variable2);
        }else if(variable1 > variable2){
            System.out.println("El numero "+variable1+" es MAYOR que "+variable2);
        }else{
            System.out.println("Los numeros "+variable1+" y "+variable2+" son iguales");
        }
    }
}
