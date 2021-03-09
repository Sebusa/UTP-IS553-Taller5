package ejercicio02.clases;

import ejercicio01.clases.RegistroLibreta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibretaDeDirecciones {
    private static List<RegistroLibreta> libreta = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void añadirEntrada(){
        String nombre;
        String dirección;
        String número;
        String correo;

        System.out.print("Ingrese el nombre: ");
        nombre = input.next();
        System.out.print("Ingrese la dirección: ");
        dirección = input.next();
        System.out.print("Ingrese el número de teléfono: ");
        número = input.next();
        System.out.print("Ingrese el correo eléctrico: ");
        correo = input.next();

        var entrada = new RegistroLibreta(nombre, dirección, número, correo);
        libreta.add(entrada);
    }

    public static void borrarEntrada(){
        System.out.print("Ingrese la posición de la lista a eliminar: ");
        int index = input.nextInt(); //Por alguna razón el .remove() de la lista no funciona con el wrapper Integer

        if(index >= 0 && index < libreta.size()){
            libreta.remove(index);
        }
        else{
            System.out.println("Número de posición no válido.");
        }
    }

    public static void mostrarEntradas(){
        if(libreta.size() == 0){
            System.out.println("No hay nada que mostrar.");
        }
        else if(libreta.size() == 1){
            System.out.println("--ENTRADA " + 1 + "--");
            System.out.println(libreta.get(0).getNombre());
            System.out.println(libreta.get(0).getDirección());
            System.out.println(libreta.get(0).getNúmeroDeTélefono());
            System.out.println(libreta.get(0).getcorreoElectrónico());
        }
        else{
            for(Integer i = 0; i < libreta.size(); i++){
                System.out.println("--ENTRADA " + i + "--");
                System.out.println(libreta.get(i).getNombre());
                System.out.println(libreta.get(i).getDirección());
                System.out.println(libreta.get(i).getNúmeroDeTélefono());
                System.out.println(libreta.get(i).getcorreoElectrónico());
            }
        }
    }

    public static void actualizarEntrada(){
        System.out.print("Ingrese la posición de la entrada a actualizar: ");
        Integer index = input.nextInt();

        if(index >= 0 && index < libreta.size()){
            String nombre;
            String dirección;
            String número;
            String correo;
    
            System.out.print("Nuevo nombre: ");
            nombre = input.next();
            System.out.print("Nueva dirección: ");
            dirección = input.next();
            System.out.print("Nuevo número de teléfono: "); 
            número = input.next();
            System.out.print("Nuevo correo electrónico: ");
            correo = input.next();

            libreta.get(index).setNombre(nombre);
            libreta.get(index).setDirección(dirección);
            libreta.get(index).setNúmeroDeTélefono(número);
            libreta.get(index).setcorreoElectrónico(correo);
        }
        else{
            System.out.println("Número de posición no válido.");
        }
    }

}