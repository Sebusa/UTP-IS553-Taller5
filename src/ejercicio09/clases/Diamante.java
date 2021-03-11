package ejercicio09.clases;

public class Diamante {

    public static Boolean generarDiamante(Integer n) throws Exception{
        if(n < 1){
            throw new Exception("Número ingresado no válido.");
          }
          else{
            //Parte superior
            for(int i = 1; i <= n; i++){
                generarEspacios(n - i);
                generarCaracter(2*i);
                System.out.println("");
            }

            //Parte inferior
            for(int i = 1; i < n; i++){
                generarEspacios(i);
                generarCaracter(2*n - 2*i);
                System.out.println("");
            }
            return true;
          }
    }

    public static void generarCaracter(Integer n){
        for(int i = 1; i < n; i++){
            System.out.print("*");
        }
    }

    public static void generarEspacios(Integer n){
        for(int i = 1; i <= n; i++){
            System.out.print(" ");
        }
    }
}
