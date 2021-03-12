package ejercicio08;

import ejercicio08.clases.Conversor;
import ejercicio08.clases.InvalidNumberException;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws InvalidNumberException {
        Scanner input = new Scanner(System.in);
        String númeroHexa;

        System.out.print("Ingrese el número hexadecimal: ");
        númeroHexa = input.next();
        var ejemplo = new Conversor(númeroHexa);

        System.out.println("Convirtiendo el número hexadecimal...");
        ejemplo.convertirNúmero();
        System.out.println("El número resultante es: " + ejemplo.getDecimal());

        input.close();
    }

}
