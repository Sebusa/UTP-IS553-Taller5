package ejercicio03.clases;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EstudianteInformatica extends Estudiante{
    Scanner input = new Scanner(System.in);
    private List<String> lenguajesDominados = new ArrayList<>();
    private String enfoque;
    
    public EstudianteInformatica(String nombre, String código, String correo, List<String> materias, 
                                 Integer semestre, List<String> lenguajes, String enfoque){
        super(nombre, código, correo, materias, semestre);
        this.setLenguajesDominados(lenguajes);
        this.setEnfoque(enfoque);
    }

    public List<String> getLenguajesDominados() {
        return lenguajesDominados;
    }
    public void setLenguajesDominados(List<String> lenguajesDominados) {
        this.lenguajesDominados = lenguajesDominados;
    }

    public String getEnfoque() {
        return enfoque;
    }
    public void setEnfoque(String enfoque) {
        this.enfoque = enfoque;
    }

    public void añadirLenguaje(){
        String lenguaje;
        System.out.print("Añada el lenguaje de programación que domina: ");
        lenguaje = input.next();
        this.lenguajesDominados.add(lenguaje);
    }

    public void eliminarLenguaje(){
        int index;
        System.out.print("Indique la posición del lenguaje que quiere eliminar: ");
        index = input.nextInt();
        
        if(index >= 0 && index < this.lenguajesDominados.size()){
            this.lenguajesDominados.remove(index);
        }
        else{
            System.out.println("Posición ingresada no válida");
        }
    }

    public void mostrarLenguajes(){
        System.out.println("Lenguajes de programación que domina: ");
        if(this.lenguajesDominados.size() == 0){
            System.out.println("No hay nada que mostrar.");
        }
        else{
            for(String lenguaje : this.lenguajesDominados){
                System.out.println("->" + lenguaje);
            }
        }
    }

    public void mostrarDatosAvanzados(){
        mostrarDatosBasicos();
        mostrarLenguajes();
        System.out.println("Enfoque del estudiante: " + this.getEnfoque());
    }
}