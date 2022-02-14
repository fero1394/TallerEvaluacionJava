package punto16.tallerfinal.sofka;

import java.util.Random;

public class Persona {
    /**
     * Atributos Persona
     */
    private String nombre = "";
    private int edad=0;
    private int DNI;
    private String sexo="H";
    private double peso=0;
    private double altura=0;

    /**
     * Constructores
     */
    public Persona(){
        generaDNI();
    }

    public Persona(String nombre,int edad,String sexo){
        this.nombre = nombre;
        this.edad = edad;
        generaDNI();
        comprobarSexo(sexo);
    }

    public Persona(String nombre,int edad,String sexo,double peso,double altura){
        this.nombre = nombre;
        this.edad = edad;
        generaDNI();
        comprobarSexo(sexo);
    }

    /**
     * Metodos
     */

    /**
     * segun las constantes establecidas dentro del metodo retorna su condicion del peso
     * @param peso
     * @param altura
     * @return peso ideal
     */

    public int calcularIMC(double peso,double altura){

        final int PESOIDEAL = -1;
        final int PORDEBAJOPESOIDEAL = 0;
        final int SOBREPESO = 1;

        int imc = (int)peso/((int)altura^2);

        if(imc<20){
            return PESOIDEAL;
        }else if(imc>=20 && imc<=25){
            return PORDEBAJOPESOIDEAL;
        }else{
            return SOBREPESO;
        }
    }

    /**
     * calcula si es mayor de edad
     * @return true si es mayor de edad de lo contrario false
     */
    public boolean esMayorDeEdad(){
        if(edad>=18){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Modifica sexo si parametro es M de lo contrario lo
     * deja por defecto que es H
     * @param sexo
     */
    private void comprobarSexo(String sexo){
        String sexoMayuscula = sexo.toUpperCase();

        if(sexoMayuscula.equalsIgnoreCase("M")){
            this.sexo = "M";
        }else{
            this.sexo = "H";
        }
    }

    /**
     * Devuelve una cadena de texto con toda la informacion
     * de el objeto instanciado con esta clase
     * @return cadena de texto con la informacion de los atributos
     */
    @Override
    public String toString(){
        return "El nombre de la persona es: "+nombre+" La edad es: "+edad+" El DNI es: "+DNI+" El sexo es: "+sexo+" Su peso es: "+peso+" Su altura: "+altura;
    }

    /**
     * genera un numero DNI para asignarselo al objeto instanciado
     * con esta clase el rango se establece de ocho cifras
     */
    private void generaDNI(){
        Random claseRandom = new Random();
        int randomDNI = claseRandom.nextInt(99999999 - 00000000);
        this.DNI = randomDNI;
    }

    /**
     * los siguientes son una serie de metodos set de los atributos
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setSexo(String sexo){
        comprobarSexo(sexo);
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    /**
     * Los siguientes son metodos getters de los valores que se necesita acceder a su valor
     */
    public String getNombre(){
        return this.nombre;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getAltura(){
        return this.altura;
    }
}
