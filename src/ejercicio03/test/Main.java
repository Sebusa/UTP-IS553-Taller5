package ejercicio03.test;

import ejercicio03.clases.EstudianteInformatica;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Valores de ejemplo
        String nombre = "Carlos Roberto";
        String código = "1100745482";
        String correo = "roberto.carlos@upv.edu.es";
        List<String> materias = new ArrayList<String>(List.of("Matemáticas IV", "POO",
                                                               "Gramáticas", "Inglés"));
        Integer semestre = 5;
        List<String> lenguajes = new ArrayList<String>(List.of("Python","C++","Kotlin",
                                                                "C#","Java","Ruby"));
        String enfoque = "Desarrollo de videojuegos.";

        EstudianteInformatica estudiante = new EstudianteInformatica(nombre, código, correo, materias, semestre, lenguajes, enfoque);
        estudiante.mostrarDatosAvanzados();

        estudiante.ingresarMateria("Estructuras");
        estudiante.añadirLenguaje();

        estudiante.eliminarLenguaje();
        estudiante.cancelarMateria("POO");

        estudiante.mostrarDatosAvanzados();
    }
}
