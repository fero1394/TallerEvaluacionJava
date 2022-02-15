package punto18.tallerfinal.sofka;

public class Videojuego implements Entregable{
    /**
     * Atributos
     */
    private String titulo;
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compañia;


    /**
     * Constructores
     */

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;

    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego() {

    }

    /**
     * Metodos Getters
     */

    public String getTitulo(){
        return titulo;
    }

    public int getHorasEstimadas(){
        return horasEstimadas;
    }

    public String getGenero(){
        return genero;
    }

    public String getCompañia(){
        return compañia;
    }

    /**
     * Metodos set de todos los atributos excepto entregado
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas){
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setCompañia(String compañia){
        this.compañia = compañia;
    }

    @Override
    public String toString(){
        return "Titulo: "+titulo+" Horas Estimadas: "+horasEstimadas+" Genero: "+genero+" Compañia: "+compañia;
    }

    @Override
    public void entregar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void isEntregado() {

    }

    @Override
    public int compareTo(Object a) {
        int salidaDelMetodo = 0;
        if(horasEstimadas == (int)a){
            salidaDelMetodo = 0;
        }else if(horasEstimadas > (int)a){
            salidaDelMetodo = -1;
        }else if(horasEstimadas < (int)a){
            salidaDelMetodo = 1;
        }
        return salidaDelMetodo;
    }


}