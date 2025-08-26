import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);

        Alumno alum1 = new Alumno();
        Docente docente1 = new Docente();
        Asignatura asignat1 = new Asignatura();

        System.out.println("El nombre del Alumno: " + alum1.getNombreAlumno());
        System.out.println("El alumno " + alum1.getNombreAlumno() + " tiene de profesor:  " + docente1.getNombre());
        System.out.println("El tipo de asignatura que enseña " + docente1.getNombre() + " es: " + asignat1.getNombreMateria());
        
     }
}