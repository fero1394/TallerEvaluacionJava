package punto18.tallerfinal.sofka;

public class Videojuego {
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

}