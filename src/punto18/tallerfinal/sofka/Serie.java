package punto18.tallerfinal.sofka;

public class Serie implements Entregable{
    /**
     * Atributos
     */
    private String titulo;
    private int numeroDeTemporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    /**
     * Constructores
     */
    public Serie(String titulo,int numeroDeTemporadas,String genero,String creador){
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }
    public Serie(String titulo,String creador){
        this.titulo = titulo;
        this.creador = creador;
    }
    public Serie(){

    }

    /**
     * Metodos getters de todos los atributos
     * @return
     */
    public String getTitulo(){
        return titulo;
    }

    public int getNumeroDeTemporadas(){
        return numeroDeTemporadas;
    }

    public String getGenero(){
        return genero;
    }

    public String getCreador(){
        return creador;
    }

    /**
     * Metodos Setters de todos los atributos menos entregado
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setNumeroDeTemporadas(int numeroTemporadas){
        this.numeroDeTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setCreador(String creador){
        this.creador = creador;
    }

    @Override
    public String toString(){
        return "Titulo: "+titulo+" Numero de temporadas: "+numeroDeTemporadas+" Genero: "+genero+" Creador: "+creador;
    }


    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int compareTo(Object a) {
        int salidaDelMetodo = 0;
        if(numeroDeTemporadas == (int)a){
            salidaDelMetodo = 0;
        }else if(numeroDeTemporadas > (int)a){
            salidaDelMetodo = -1;
        }else if(numeroDeTemporadas < (int)a){
            salidaDelMetodo = 1;
        }
        return salidaDelMetodo;
    }

}
