package ejercicio06.clases;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaReales implements Estadísticas{
    private List<Double> listaReales = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    @Override
    public void obtenerMinimo(){
        Double mínimo = null;
        for(Double número : this.listaReales){
            if(mínimo == null){
                mínimo = número;
            }
            else if(número < mínimo){
                mínimo = número;
            }
        }
        if(mínimo != null){
            System.out.println("El valor mínimo de la lista es: " + mínimo);
        }
        else System.out.println("No se encontró ningún valor.");
    }

    @Override
    public void obtenerMaximo(){
        Double maximo = null;
        for(Double número : this.listaReales){
            if(maximo == null){
                maximo = número;
            }
            else if(número > maximo){
                maximo = número;
            }
        }
        if(maximo != null){
            System.out.println("El valor mínimo de la lista es: " + maximo);
        }
        else System.out.println("No se encontró ningún valor.");
    }

    @Override
    public void calcularMedia() {
        Double suma = 0.0;
        for(Double número : this.listaReales){
            suma += número;
        }
        Double media = suma / this.listaReales.size();
        System.out.println("El valor de la media es: " + media);
    }

    @Override
    public void calcularPromedio() {
        Double suma = 0.0;
        for(Double número : this.listaReales){
            suma += número;
        }
        Double promedio = suma / this.listaReales.size();
        System.out.println("El valor del promedio es: " + promedio);
    }

    @Override
    public void calcularSumar(){
        Double suma = 0.0;
        for(Double número : this.listaReales){
            suma += número;
        }
        System.out.println("El valor de la suma es: " + suma);
    }

    public void añadirDatos(){
        Double dato;

        System.out.print("Ingrese el valor del dato: ");
        dato = input.nextDouble();
        this.listaReales.add(dato);
    }

    public void mostrarEntradas(){
        if(this.listaReales.size() == 0){
            System.out.println("No hay nada que mostrar.");
        }
        else{
            System.out.println("Datos ingresados: ");
            for(Double dato : this.listaReales){
                System.out.print("|" + dato + "|");

            }
        }
    }

    public void actualizarDatos(){
        Integer index;

        System.out.println("Ingrese la posición del dato a actualizar: ");
        index = input.nextInt();

        if(index >= 0 && index < this.listaReales.size()){
            Double dato;

            System.out.print("Ingrese el valor  dato: ");
            dato = input.nextDouble();
            this.listaReales.set(index, dato);
        }
        else{
            System.out.println("Número de posición no válido.");
        }
    }

    public void eliminarDatos(){
        int index;

        System.out.println("Ingrese la posición del dato a actualizar: ");
        index = input.nextInt();

        if(index >= 0 && index < this.listaReales.size()){
            this.listaReales.remove(index);
        }
        else{
            System.out.println("Número de posición no válido.");
        }
    }
}