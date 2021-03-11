package ejercicio09;

import ejercicio09.clases.Diamante;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        Integer n = input.nextInt();

        Diamante.generarDiamante(n);

        input.close();
    }
}
