package ejercicio05.test;

import java.util.Scanner;

import ejercicio05.clases.Factura;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String emisor;
        String nombre;
        Double precio;

        System.out.print("Ingrese el nombre del emisor: ");
        emisor = input.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        nombre = input.nextLine();
        System.out.print("Ingrese el precio del recibo: ");
        precio = input.nextDouble();

        var recibo = new Factura(emisor, nombre, precio);
        recibo.imprimirFactura();

        input.close();
    }
}
