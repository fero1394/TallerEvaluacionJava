package punto17.tallerfinal.sofka;

public class Television extends Electrodomestico{
    /**
     * Atributos
     */
    private final double RESOLUCION = 20.0;
    private final boolean SINTONIZADORTDT = false;
    private double resolucion;
    private boolean sintonizadorTDT;

    /**
     * Constructores
     */
    public Television(){
        super();
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADORTDT;
    }

    public Television(double precio, double peso){
        super(precio,peso);
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADORTDT;
    }

    public Television(double precioBase,String color,char consumoEnergetico,double peso,double resolucion,boolean sintonizadorTDT){
        super(precioBase,color,consumoEnergetico,peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;

    }

    /**
     * Metodos Getters
     */
    public double getResolucion(){
        return resolucion;
    }

    public boolean getSintonizadorTDT(){
        return sintonizadorTDT;
    }

    /**
     * Metodo precio final de televisores conservando las condiciones de la clase padre
     * @return
     */
    public double precioFinal(){
        double variablePrecioFinal = super.precioFinal();
        if(resolucion>40){
            variablePrecioFinal += (variablePrecioFinal*0.30);
        }
        if(sintonizadorTDT){
            variablePrecioFinal += 50.0;
        }
        return variablePrecioFinal;
    }



}
