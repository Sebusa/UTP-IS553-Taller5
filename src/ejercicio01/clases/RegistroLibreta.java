package ejercicio01.clases;

public class RegistroLibreta {
    private String nombre;
    private String dirección;
    private String númeroDeTélefono;
    private String correoElectrónico;

    //Constructor
    public RegistroLibreta(String nombre, String dirección, String númeroDeTélefono, String correoElectrónico) {
        this.setNombre(nombre);
        this.setDirección(dirección);
        this.setNúmeroDeTélefono(númeroDeTélefono);
        this.setcorreoElectrónico(correoElectrónico);
    }

     public String getcorreoElectrónico() {
        return correoElectrónico;
    }
    public void setcorreoElectrónico(String correoElectrónico) {
        this.correoElectrónico = correoElectrónico;
    }

    public String getNúmeroDeTélefono() {
        return númeroDeTélefono;
    }
    public void setNúmeroDeTélefono(String númeroDeTélefono) {
        this.númeroDeTélefono = númeroDeTélefono;
    }

    public String getDirección() {
        return dirección;
    }
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    //Métodos mutadores
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
