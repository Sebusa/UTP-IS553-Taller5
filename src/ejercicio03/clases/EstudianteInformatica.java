package ejercicio03.clases;
import ejercicio03.clases.Estudiante;

public class EstudianteInformatica extends Estudiante{
    private Integer númeroLenguajesDominados;
    private String[] lenguajesDominados = new String[númeroLenguajesDominados];
    private String enfoque;

    public EstudianteInformatica(String nombre, String código, Integer númeroDeMaterias, 
                                 String[] materias, Integer semestre){
        super(nombre, código, númeroDeMaterias, materias, semestre);
    }
}