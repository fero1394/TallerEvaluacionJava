package tallerfinalJavaPunto1a15;

/*Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también.
Ve cambiando los valores para comprobar que funciona.*/

public class Punto1 {
    public static void main(String[] args) {

        double variable1 = 5;
        double variable2 = 5;

        if(variable1 < variable2){
            System.out.println("El numero "+variable1+" es MENOR que "+variable2);
        }else if(variable1 > variable2){
            System.out.println("El numero "+variable1+" es MAYOR que "+variable2);
        }else{
            System.out.println("Los numeros "+variable1+" y "+variable2+" son iguales");
        }
    }
}
