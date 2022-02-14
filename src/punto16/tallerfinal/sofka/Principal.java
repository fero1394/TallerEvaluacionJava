package punto16.tallerfinal.sofka;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        /**
         * En esta seccion se crean los parametros de los 3 objetos que se van a crear
         */
        String nombrePersona1;
        String nombrePersona2;
        String nombrePersona3;

        int edadPersona1;
        int edadPersona2;
        int edadPersona3;

        String sexoPersona1 = "H";
        String sexoPersona2;
        String sexoPersona3;

        double pesoPersona1;
        double pesoPersona2;
        double pesoPersona3;

        double alturaPersona1;
        double alturaPersona2;
        double alturaPersona3;

        /**
         * Acontinuacion se piden los datos al usuario del
         * primer objeto que se va a crear y se inicializa el constructor del primer objeto
         */

        nombrePersona1 = JOptionPane.showInputDialog("Ingresa el nombre de la primera persona: ");

        edadPersona1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la primera persona: "));

        sexoPersona1 = JOptionPane.showInputDialog("\"Ingresa el sexo con una letra 'H' para hombre 'M' para mujer de la primera persona: \"");

        pesoPersona1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el peso de la primera persona: "));

        alturaPersona1 = Double.parseDouble(JOptionPane.showInputDialog("\"Ingresa la altura de la primera persona: \""));


        Persona persona1 = new Persona(nombrePersona1, edadPersona1, sexoPersona1, pesoPersona1, alturaPersona1);

        /**
         * Acontinuacion se inicializa los parametros del segundo objeto, creado con
         * un constructor que contiene los parametros nombre,edad,sexo
         */

        nombrePersona2 = JOptionPane.showInputDialog("Ingresa nombre de la segunda persona: ");

        edadPersona2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa edad de la segunda persona: "));

        sexoPersona2 = JOptionPane.showInputDialog("\"Ingresa el sexo con una letra 'H' para hombre 'M' para mujer de la segunda persona: \"");



        Persona persona2 = new Persona(nombrePersona2, edadPersona2, sexoPersona2);

        pesoPersona2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la segunda persona:"));
        persona2.setPeso(pesoPersona2);

        alturaPersona2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la segunda persona"));
        persona2.setAltura(alturaPersona2);



        /**
         * Acontinuacion se crea el tercer objeto con el constructor sin parametros
         */

        Persona persona3 = new Persona();

        nombrePersona3 = JOptionPane.showInputDialog("Ingresa el nombre de la tercera persona: ");
        persona3.setNombre(nombrePersona3);

        edadPersona3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la tercera persona: "));
        persona3.setEdad(edadPersona3);

        sexoPersona3 = JOptionPane.showInputDialog("\"Ingresa el sexo con una letra 'H' para hombre 'M' para mujer de la tercera persona: \"");
        persona3.setSexo(sexoPersona3);

        pesoPersona3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la tercera persona:"));
        persona3.setPeso(pesoPersona3);

        alturaPersona3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la segunda persona"));
        persona3.setAltura(alturaPersona3);

        /**
         * Se crea una lista para guardar los 3 objetos creados anteriormente
         */

        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);

        /**
         * Se crea un menu para conocer que quiere saber el usuario
         * de las personas creadas
         */

        int opcionIngresaUsuarioMenu = Integer.parseInt(JOptionPane.showInputDialog("****MENU****\n" +
                "1-PARA COMPROBAR SI LA PERSONA ESTA EN EL PESO IDEAL\n" +
                "2-PARA SABER SI LA PERSONA ES MAYOR DE EDAD\n" +
                "3-MOSTRAR INFORMACION DE LAS 3 PERSONAS\n"));

        /**
         * Segun la opcion que el usuario haya escogido, el programa
         * tomara la desicion correcta para cumplir la peticion del usuario
         */
        int pesoideal;
        switch(opcionIngresaUsuarioMenu){
            case 1:
                for(int i=0;i<=2;i++){
                    pesoideal = listaPersonas.get(i).calcularIMC(listaPersonas.get(i).getPeso(),listaPersonas.get(i).getAltura() );
                    if(pesoideal==-1){
                        JOptionPane.showMessageDialog(null, listaPersonas.get(i).getNombre()+" Tiene el peso Ideal");
                    }else if(pesoideal == 0){
                        JOptionPane.showMessageDialog(null,listaPersonas.get(i).getNombre()+" esta por Debajo de su peso Ideal");
                    }else{
                        JOptionPane.showMessageDialog(null,listaPersonas.get(i).getNombre()+" Tiene SobrePeso");

                    }
                }
                break;
            case 2:
                for(int i=0;i<=2;i++){
                    if(listaPersonas.get(i).esMayorDeEdad()){
                        JOptionPane.showMessageDialog(null,listaPersonas.get(i).getNombre() +" Es Mayor de edad");
                    }else{
                        JOptionPane.showMessageDialog(null,listaPersonas.get(i).getNombre() +" Es Menor de edad");

                    }
                }
                break;
            case 3:
                for(int i=0;i<=2;i++){
                    System.out.println(listaPersonas.get(i).toString());
                }
                break;
        }
    }
}
