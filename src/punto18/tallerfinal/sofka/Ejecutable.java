package punto18.tallerfinal.sofka;

import java.io.SequenceInputStream;

public class Ejecutable {
    public static void main(String[] args) {
        /**
         * Se crea dos array para almacenar una lista de objetos serie y videojuego luego se crean los objetos
         * y se almacenan
         */
        Videojuego listaVideojuego[] = new Videojuego[5];
        Serie listaSeries[] = new Serie[5];

        Videojuego callduty = new Videojuego("Call of Duty",8,"Accion","XBOX");
        Videojuego minecraft = new Videojuego("Minecraft",4,"Aventura","Microsoft");
        Videojuego godofwar = new Videojuego("God of War",5);
        Videojuego superMario = new Videojuego("Super Mario",6,"Aventura","Nintendo");
        Videojuego fornite = new Videojuego("Fornite",4);

        listaVideojuego[0] = callduty;
        listaVideojuego[1] = minecraft;
        listaVideojuego[2] = godofwar;
        listaVideojuego[3] = superMario;
        listaVideojuego[4] = fornite;

        Serie vikingos = new Serie("Vikingos",5,"Accion","Rgnar Lodbrok");
        Serie mrRobot = new Serie("Mr Robot",3,"Tecnologia","Fernando");
        Serie laCasaDePapel = new Serie("La Casa De Papel","FelipeQ");
        Serie dark = new Serie("Dark",6,"Drama","GustavoB");
        Serie howToSellDrugsOnlineFast = new Serie();

        listaSeries[0] = vikingos;
        listaSeries[1] = mrRobot;
        listaSeries[2] = laCasaDePapel;
        listaSeries[3] = dark;
        listaSeries[4] = howToSellDrugsOnlineFast;

        /**
         * Se entrega algunos videojuegos y series
         */
        listaVideojuego[0].entregar();
        listaVideojuego[2].entregar();
        listaVideojuego[4].entregar();

        listaSeries[1].entregar();
        listaSeries[3].entregar();

        int contadorDeVideoJuegosEntregados = 0;
        int contadorDeSeriesEntregadas = 0;

        for(int i=0;i<listaVideojuego.length;i++){
            if(listaVideojuego[i].isEntregado()){
                contadorDeVideoJuegosEntregados +=1;
            }
            if(listaSeries[i].isEntregado()){
                contadorDeSeriesEntregadas +=1;
            }
        }

        System.out.println("La cantidad de VideoJuegos Entregados es: "+contadorDeVideoJuegosEntregados+
                " Y la cantidad de Series Entregadas es: "+contadorDeSeriesEntregadas);

        Videojuego videojuego = new Videojuego();
        int masHorasEstimadas = 0;
        Serie serie = new Serie();
        int masTemporadas = 0;

        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].getNumeroDeTemporadas()>masTemporadas){
                masTemporadas = listaSeries[i].getNumeroDeTemporadas();
                serie = listaSeries[i];
            }
        }

        for(int i=0;i<listaVideojuego.length;i++){
            if(listaVideojuego[i].getHorasEstimadas()>masHorasEstimadas){
                masHorasEstimadas = listaVideojuego[i].getHorasEstimadas();
                videojuego = listaVideojuego[i];
            }
        }

        System.out.println("El videoJuego con mas horas Estimadas es: "+videojuego.toString()+
                "\nLa serie con mas temporadas es: "+serie.toString());


    }
}
