package ejercicio03.clases;

public class Estudiante {
    protected String nombre;
    protected String código;
    protected Integer númeroMaterias;
    protected String[] materias = new String[númeroMaterias];
    protected Integer semestre;

    public Estudiante(String nombre, String código, Integer númeroDeMaterias, String[] materias, Integer semestre) {
        this.nombre = nombre;
        this.código = código;
        this.númeroMaterias = númeroDeMaterias;
        this.materias = materias;
        this.semestre = semestre;
    }

    public void mostrarMaterias(){
        System.out.println("Materias matriculadas: ");
        for(String materia : this.materias){
            System.out.println(materia);
        }
    }

    public void mostrarDatos(){
        System.out.println("Nombre del estudiante: " + this.nombre);
        System.out.println("Código del estudiante: " + this.código);
        System.out.println("Número de materias: " + this.númeroMaterias);
        mostrarMaterias();
        System.out.println("Número del semestre: " + this.semestre);
    }
}
