package punto17.tallerfinal.sofka;

import java.util.ArrayList;

public class Electrodomestico {
    /**
     * Atributos
     */
    private final double PRECIOBASE = 100;
    private final String COLOR = "Blanco";
    private final char CONSUMOENERGETICO = 'F';
    private final double PESO = 5;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
    private ArrayList<Character> listaLetrasConsumo = new ArrayList<Character>();

    /**
     * Constructores
     */
    //CONSTRUCTOR CON PRECIOBASE Y PESO EL RESTO DE ATRIBUTOS POR DEFECTO
    public Electrodomestico(double precioBase,double peso){
        this.precioBase = precioBase;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMOENERGETICO;
        this.peso = peso;

    }

    //CONSTRUCTOR CON TODOS LOS ATRIBUTOS
    public Electrodomestico(double precioBase,String color,char consumoEnergetico,double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    //CONSTRUCTOR POR DEFECTO
    public Electrodomestico(){
        this.precioBase = PRECIOBASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMOENERGETICO;
        this.peso = PESO;
    }

    /**
     * metodos getters
     */

    public double getPrecioBase(){
        return precioBase;
    }

    public String getColor(){
        return color;
    }

    public char getConsumoEnergetico(){
        return consumoEnergetico;
    }

    public double getPeso(){
        return peso;
    }

    /**
     * comprueba si la letra que se ingresa como parametro esta en la lista de las opciones
     * que existen si no esta se deja la letra por defecto
     * @param letra
     */
    public void comprobarConsumoEnergetico(char letra){
        listaLetrasConsumo.add('A');
        listaLetrasConsumo.add('B');
        listaLetrasConsumo.add('C');
        listaLetrasConsumo.add('D');
        listaLetrasConsumo.add('E');
        listaLetrasConsumo.add('F');

        char letraMayuscula = Character.toUpperCase(letra);
        for(int i = 0; i<=listaLetrasConsumo.size(); i++){
            if(letraMayuscula != listaLetrasConsumo.get(i)){
                this.consumoEnergetico = CONSUMOENERGETICO;
            }else{
                this.consumoEnergetico = letra;
            }
        }
    }





}
