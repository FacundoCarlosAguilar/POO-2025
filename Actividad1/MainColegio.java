package Actividad1;
public class MainColegio {
    public static void main(String[] args) {

        Alumno alum1 = new Alumno();
        Docente docente1 = new Docente();
        Asignatura asignat1 = new Asignatura();

        System.out.println("El nombre del Alumno: " + alum1.getNombreAlumno());
        System.out.println("El alumno " + alum1.getNombreAlumno() + " tiene de profesor:  " + docente1.getNombreDocente());
        System.out.println("El tipo de asignatura que enseña " + docente1.getNombreDocente() + " es: " + asignat1.getNombreMateria());       
     }
}