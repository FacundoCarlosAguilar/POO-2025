public class Clase {
    public static void main(String[] args) {

        Alumno alum1 = new Alumno("José", "Pérez", "Redes", 19, 5);
        Docente docente1 = new Docente("Juan", "Gómez", 35);
        Asignatura asignat1 = new Asignatura("POO", "9", 3, 4, 7.0);

        System.out.println("El nombre del Alumno: " + alum1.getNombreAlumno());
        System.out.println("El alumno " + alum1.getNombreAlumno() + " tiene de profesor: " + docente1.getNombreDocente());
        System.out.println("El tipo de asignatura que enseña " + docente1.getNombreDocente() + " es: " + asignat1.getNombreMateria());


        System.out.println("La información completa del Alumno");
        System.out.println(alum1.toString());


    }
}