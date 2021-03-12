package ejercicio02.test;

import ejercicio02.clases.LibretaDeDirecciones;

public class Main {
    public static void main(String[] args) {
        var libreta = new LibretaDeDirecciones();

        System.out.println("Hola! este es mi programa que prueba mis funciones. "
                            + "Probemos!");

        System.out.println("Añadiendo una entrada: ");
        libreta.añadirEntrada();
        System.out.println("\nAñadamos otra entrada: ");
        libreta.añadirEntrada();
        System.out.println("\nMostremos lo que llevamos: ");
        libreta.mostrarEntradas();
        System.out.println("\nAhora, actualicemos uno de los datos: ");
        libreta.actualizarEntrada();
        System.out.println("\nMiremos el cambio: ");
        libreta.mostrarEntradas();
        System.out.println("\nAhora borremos una entrada: ");
        libreta.borrarEntrada();
        System.out.println("\nMiremos qué queda: ");
        libreta.mostrarEntradas();

        System.out.println("\nHa sido todo por hoy. Nos vemos!");
    }
}
