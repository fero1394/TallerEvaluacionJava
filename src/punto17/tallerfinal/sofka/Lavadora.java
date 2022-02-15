package punto17.tallerfinal.sofka;

public class Lavadora extends Electrodomestico{

    /**
     * Atributos
     */
    private final double CARGA = 5;
    private double carga;

    /**
     * Constructores
     */
    public Lavadora(){
        super();
        this.carga = CARGA;
    }

    public Lavadora(double precio,double peso){
        super(precio,peso);
        this.carga = CARGA;
    }

    public Lavadora(double precioBase,String color,char consumoEnergetico,double peso,double carga){
        super(precioBase,color,consumoEnergetico,peso);
        this.carga = carga;
    }

    /**
     * metodo get carga
     */

    public double getCarga(){
        return carga;
    }

    /**
     * metodo para calcular el precio final teniendo encuenta las condiciones de la clase
     * padre
     */
    public double precioFinal(){
        double variablePrecioFinal = super.precioFinal();

        if(carga>30.0){
            variablePrecioFinal =+ 50.0;
        }

        return variablePrecioFinal;
    }




}
