package ejercicio07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio07.clases.MyMath;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        Integer n = 4;
        for(Integer i = 1; i <= n; i++){
            añadirDato(lista);
        }
        var mate = new MyMath();

        System.out.println(mate.min(lista));
        System.out.println(mate.max(lista));

    }

    public static void añadirDato(List<Integer> lista){
        Integer dato;

        System.out.print("Ingrese el dato: ");
        dato = input.nextInt();

        lista.add(dato);

    }

    public static void mostrarDatos(List<Integer> lista){
        for(Integer dato : lista){
            System.out.print("|" + dato + "|");
        }
    }
}
