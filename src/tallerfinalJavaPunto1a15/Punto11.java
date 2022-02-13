package tallerfinalJavaPunto1a15;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Todo:Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
 * @autor Fernando Quiceno Gomez
 */
public class Punto11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /**
         * se crea la variable fraseIngresadaporUsuario para guardar la frase que se ingresa por consola
         * adicional se crea una estructura de datos llamada hashMap para guardar la cantidad de vocales
         * que se encuentran en la frase, estas se inicializan en 0
         */
        
        String fraseIngresadaporUsuario;
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("a",0);
        hashMap.put("e",0);
        hashMap.put("i",0);
        hashMap.put("o",0);
        hashMap.put("u",0);

        System.out.println("Ingrese una frase");
        fraseIngresadaporUsuario = entrada.nextLine();

        /**
         * En el siguiente ciclo for se recorre la frase ingresada por el usuario
         * y valida caracter a carcater buscando vocales, contando y guardando cada vocal encontrada
         * en sus valores dentro del hashMap
         */

        for(int i=0;i<fraseIngresadaporUsuario.length();i++){
            char letraActual = fraseIngresadaporUsuario.charAt(i);

            switch(String.valueOf(letraActual).toLowerCase()){
                case "a":
                    hashMap.put("a",hashMap.get("a")+1);
                    break;

                case "e":
                    hashMap.put("e",hashMap.get("e")+1);
                    break;

                case "i":
                    hashMap.put("i",hashMap.get("i")+1);
                    break;

                case "o":
                    hashMap.put("o",hashMap.get("o")+1);
                    break;

                case "u":
                    hashMap.put("u",hashMap.get("u")+1);
                    break;

                default:
                    continue;

            }
        }

        /**
         * Se imprime la cantidad de letras que contiene la frase ingresada por el usuario  y
         * la cantidad de vocales en la frase inficando cada una de las vocales
         */

        System.out.println("la frase tiene una longitud de: "+fraseIngresadaporUsuario.length()+" letras y contiene las siguientes cantidades de vocales:\n"+
                "vocal a: "+hashMap.get("a")+"\n"+
                "vocal e: "+hashMap.get("e")+"\n"+
                "vocal i: "+hashMap.get("i")+"\n"+
                "vocal o: "+hashMap.get("o")+"\n"+
                "vocal u: "+hashMap.get("u"));
    }

}
