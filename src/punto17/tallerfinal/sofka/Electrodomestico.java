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
    private ArrayList<String> listaColores = new ArrayList<String>();

    /**
     * Constructores
     */
    //CONSTRUCTOR CON PRECIOBASE Y PESO EL RESTOD DE ATRIBUTOS POR DEFECTO
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
    }

    //CONSTRUCTOR POR DEFECTO
    public Electrodomestico(){
        this.precioBase = PRECIOBASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMOENERGETICO;
        this.peso = PESO;
    }






}
