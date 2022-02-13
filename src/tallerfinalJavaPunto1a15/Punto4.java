package tallerfinalJavaPunto1a15;

import java.util.Scanner;

/**
 * TODO:Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 * @author Fernando Quiceno Gomez*/

public class Punto4 {
    public static void main(String[] args) {

        final double IVA = 0.21;
        double precioProducto;
        double precioProductoMasIva;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto: ");

        precioProducto = entrada.nextDouble();

        precioProductoMasIva = precioProducto+(precioProducto*IVA);

        System.out.println("El Precio de su producto mas iva es de: "+precioProductoMasIva+" Dolares");

    }
}
