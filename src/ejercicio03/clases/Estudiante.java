package ejercicio03.clases;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Estudiante {
    protected String nombre;
    protected String código;
    protected String correoElectrónico;
    protected List<String> materias = new ArrayList<>();
    protected Integer semestre;

    Scanner input = new Scanner(System.in);

    public Estudiante(String nombre, String código, String correo, List<String> materias, Integer semestre) {
        this.nombre = nombre;
        this.código = código;
        this.correoElectrónico = correo;
        this.materias = materias;
        this.semestre = semestre;
    }

    public void mostrarMaterias(){
        System.out.println("Materias matriculadas: ");
        for(String materia : this.materias){
            System.out.println("-" + materia);
        }
    }

    public void mostrarDatosBasicos(){
        System.out.println("Nombre del estudiante: " + this.nombre);
        System.out.println("Código del estudiante: " + this.código);
        System.out.println("Correo electrónico: " + this.correoElectrónico);
        mostrarMaterias();
        System.out.println("Número del semestre: " + this.semestre);
    }

    public void ingresarMateria(String materia){
        this.materias.add(materia);
    }

    public Boolean cancelarMateria(String materia){
        if(this.materias.contains(materia)){
            this.materias.remove(materia);
            return true;
        }
        else{
            return false;
        }
    }
}
