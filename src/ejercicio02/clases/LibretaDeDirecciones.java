package ejercicio02.clases;

import ejercicio01.clases.RegistroLibreta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibretaDeDirecciones {
    private List<RegistroLibreta> libreta = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public void añadirEntrada(){
        String nombre;
        String dirección;
        String número;
        String correo;

        System.out.print("Ingrese el nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese la dirección: ");
        dirección = input.nextLine();
        System.out.print("Ingrese el número de teléfono: ");
        número = input.nextLine();
        System.out.print("Ingrese el correo eléctrico: ");
        correo = input.nextLine();

        var entrada = new RegistroLibreta(nombre, dirección, número, correo);
        this.libreta.add(entrada);
    }

    public void borrarEntrada(){
        System.out.print("Ingrese la posición de la lista a eliminar: ");
        int index = input.nextInt(); //Por alguna razón el .remove() de la lista no funciona con el wrapper Integer

        if(index >= 0 && index < this.libreta.size()){
            this.libreta.remove(index);
        }
        else{
            System.out.println("Número de posición no válido.");
        }
    }

    public void mostrarEntradas(){
        if(this.libreta.size() == 0){
            System.out.println("No hay nada que mostrar.");
        }
        else{
            System.out.println("Entradas ingresadas: ");
            for(RegistroLibreta dato : this.libreta){
                System.out.println("||" + dato.getNombre()
                                    + "||" + dato.getDirección()
                                    + "||" + dato.getNúmeroDeTélefono()
                                    + "||" + dato.getcorreoElectrónico());
            }
        }
    }

    public void actualizarEntrada(){
        System.out.print("Ingrese la posición de la entrada a actualizar: ");
        Integer index = input.nextInt();

        if(index >= 0 && index < this.libreta.size()){
            String nombre;
            String dirección;
            String número;
            String correo;
    
            System.out.print("Nuevo nombre: ");
            nombre = input.nextLine();
            System.out.print("Nueva dirección: ");
            dirección = input.nextLine();
            System.out.print("Nuevo número de teléfono: "); 
            número = input.nextLine();
            System.out.print("Nuevo correo electrónico: ");
            correo = input.nextLine();

            this.libreta.get(index).setNombre(nombre);
            this.libreta.get(index).setDirección(dirección);
            this.libreta.get(index).setNúmeroDeTélefono(número);
            this.libreta.get(index).setcorreoElectrónico(correo);
        }
        else{
            System.out.println("Número de posición no válido.");
        }
    }

}