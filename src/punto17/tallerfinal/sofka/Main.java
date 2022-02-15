package punto17.tallerfinal.sofka;

public class Main {
    public static void main(String[] args) {

        /**
         * Se crea una array donde se almacenaran los objetos de tipo electrodomestico
         * por herencia podemos almacenar tipo television y lavadora ya que son hijas de el
         * objeto electrodomestico
         */
        Electrodomestico[] listaElectrodomestico = new Electrodomestico[10];

      Television lg = new Television();
      Television panasonic = new Television(150,"gris",'B',15,42,true);
      Lavadora samsung = new Lavadora();
      Lavadora electrolux = new Lavadora(200,"rojo",'F',30,15);
      Television sony = new Television(110,25);
      Television philips = new Television(200,"negro",'E',30,50,false);
      Television xiaomi = new Television(500,"rojo",'A',50,70,true);
      Lavadora hitachi = new Lavadora(230,40);
      Lavadora jvc = new Lavadora(210,"blanco",'C',40,40);
      Television huawei = new Television(50,10);
      Television apple = new Television(300,"azul",'D',50,60,false);

      listaElectrodomestico[0] = lg;
      listaElectrodomestico[1] = panasonic;
      listaElectrodomestico[2] = electrolux;
      listaElectrodomestico[3] = sony;
      listaElectrodomestico[4] = philips;
      listaElectrodomestico[5] = xiaomi;
      listaElectrodomestico[6] = hitachi;
      listaElectrodomestico[7] = jvc;
      listaElectrodomestico[8] = huawei;
      listaElectrodomestico[9] = apple;

      double sumaPrecioTelevisores = 0;
      double sumaPrecioLavadoras = 0;
      double sumaPrecioElectrodomesticos = 0;

        /**
         * En el siguiente bucle se recorre el array de objetos y separa la suma de sus
         * precios finales segun su tipo
         */
      for(int i=0;i<listaElectrodomestico.length;i++){
          if(listaElectrodomestico[i] instanceof Television){
              sumaPrecioTelevisores += listaElectrodomestico[i].precioFinal();
          }if(listaElectrodomestico[i] instanceof Lavadora){
              sumaPrecioLavadoras += listaElectrodomestico[i].precioFinal();
          }if(listaElectrodomestico[i] instanceof Electrodomestico){
              sumaPrecioElectrodomesticos += listaElectrodomestico[i].precioFinal();
          }

//          System.out.println(listaElectrodomestico[i].precioFinal());
      }
        System.out.println("La suma total de los precios de los televisores es: "+sumaPrecioTelevisores+
                "\nLa suma total de los precios de las lavadoras es: "+sumaPrecioLavadoras+
                "\nLa suma total de todos los electrodomesticos es: "+sumaPrecioElectrodomesticos);
    }
}