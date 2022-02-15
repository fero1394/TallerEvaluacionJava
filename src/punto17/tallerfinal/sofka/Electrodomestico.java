package punto17.tallerfinal.sofka;

import java.util.ArrayList;
import java.util.HashMap;

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
    private ArrayList<String> listaColores = new ArrayList<String>();
    HashMap<Character,Double> preciosSegunConsumo = new HashMap<>();

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
        this.peso = peso;
        comprobarColor(color);
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
        for(int i = 0; i<listaLetrasConsumo.size(); i++){
            if(letraMayuscula != listaLetrasConsumo.get(i)){
                this.consumoEnergetico = CONSUMOENERGETICO;
            }else{
                this.consumoEnergetico = letra;
            }
        }
    }

    /**
     * comprueba que el color corresponda a los colores que hay disponibles
     * si no corresponde se deja por defecto el color blanco
     * @param color
     */

    public void comprobarColor(String color){
        listaColores.add("NEGRO");
        listaColores.add("BLACO");
        listaColores.add("ROJO");
        listaColores.add("AZUL");
        listaColores.add("GRIS");

        String colorMayuscula = color.toUpperCase();
        for(int i=0;i< listaColores.size();i++){
            if(colorMayuscula != listaColores.get(i)){
                this.color = COLOR;
            }else{
                this.color = color;
            }
        }
    }

    /**
     * se usa una coleccion llamada hashMap el cual nos permite añadir claves/valor
     * en el hashMap use para guardar la lista de precios del consumo energetico
     * el programa busca el consumo y se lo suma al precio final el cual ya tiene asignado
     * el precio base luego con un condicional evalua en que peso se encuentra el objeto
     * y le suma su valor correspondiente
     * @return
     */
    public double precioFinal(){
        double preciofinal = 0;
        preciofinal += precioBase;

        preciosSegunConsumo.put('A', 100.0);
        preciosSegunConsumo.put('B', 80.0);
        preciosSegunConsumo.put('C', 60.0);
        preciosSegunConsumo.put('D', 50.0);
        preciosSegunConsumo.put('E', 30.0);
        preciosSegunConsumo.put('F', 10.0);

        preciofinal += preciosSegunConsumo.get(consumoEnergetico);

        if(peso>=0 && peso<=19){
            preciofinal += 10.0;
        }else if(peso>=20 && peso<=49){
            preciofinal += 50.0;
        }else if(peso>=50 && peso<=79){
            preciofinal += 80.0;
        }else if(peso>=80){
            preciofinal += 100.0;
        }else{
            System.out.println("El peso no es correcto");
        }
        return preciofinal;
    }






}
