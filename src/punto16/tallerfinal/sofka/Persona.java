package punto16.tallerfinal.sofka;

public class Persona {
    /**
     * Atributos Persona
     */
    private String nombre = "";
    private int edad=0;
    private int DNI;
    private char sexo = 'H';
    private double peso=0;
    private double altura=0;

    /**
     * Constructores
     */
    public Persona(){

    }

    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre,int edad,int DNI,char sexo,double peso,double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        comprobarSexo(sexo);
    }

    /**
     * Metodos
     */

    public int calcularIMC(int peso,int altura){

        final int PESOIDEAL = -1;
        final int PORDEBAJOPESOIDEAL = 0;
        final int SOBREPESO = 1;

        int imc = peso/(altura^2);

        if(imc<20){
            return PESOIDEAL;
        }else if(imc>=20 && imc<=25){
            return PORDEBAJOPESOIDEAL;
        }else{
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad(){
        if(edad>=18){
            return true;
        }
        else{
            return false;
        }
    }

    private void comprobarSexo(char sexo){
        char sexoMayuscula = Character.toUpperCase(sexo);

        if(sexoMayuscula == 'M'){
            this.sexo = 'M';
        }
    }


}
