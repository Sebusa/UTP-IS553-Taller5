package ejercicio06;

import ejercicio06.clases.ListaReales;

public class Main {
    public static void main(String[] args) {
        var lista = new ListaReales();

        Integer n = 4;

        System.out.println("Número de valores iniciales: " + n);
        for(int i = 0; i < 4; i++){
            lista.añadirDatos();
        }

        lista.mostrarEntradas();

        System.out.println("\nHaciendo operaciones...");
        lista.calcularMedia();
        lista.calcularPromedio();
        lista.calcularSumar();
        lista.obtenerMaximo();
        lista.obtenerMinimo();
    }
}
