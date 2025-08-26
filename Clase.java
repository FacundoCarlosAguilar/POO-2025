import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Docente docente1 = new Docente();
        Alumno alumno1 = new Alumno();
        Asignatura asignatura1 = new Asignatura();
        
        boolean continuar = true;
        int opcion = 0;

        while (continuar) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Ver datos Docente");
            System.out.println("2. Ingresar datos de Docente");
            System.out.println("3. Ver datos Alumno");
            System.out.println("4. Ingresar datos de Alumno");
            System.out.println("5. Ver datos Asignatura");
            System.out.println("6. Ingresar datos de Asignatura");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n--- DATOS DOCENTE ---");
                    System.out.println("Nombre: " + docente1.getNombreDocente());
                    System.out.println("Apellido: " + docente1.getApellidoDocente());
                    System.out.println("Especialidad: " + docente1.getEspecialidad());
                    break;
                    
                case 2:
                    docente1.ingresarDatosDocente();
                    System.out.println("Datos del docente ingresados correctamente");
                    break;
                    
                case 3:
                    System.out.println("\n--- DATOS ALUMNO ---");
                    System.out.println("Nombre: " + alumno1.getNombreAlumno());
                    System.out.println("Apellido: " + alumno1.getApellido());
                    System.out.println("Edad: " + alumno1.getEdad());
                    System.out.println("Curso: " + alumno1.getCurso());
                    System.out.println("Materias: " + alumno1.getCantMaterias());
                    break;
                    
                case 4:
                    alumno1.ingresarDatosAlumno();
                    System.out.println("Datos del alumno ingresados correctamente");
                    break;
                    
                case 5:
                    System.out.println("\n--- DATOS ASIGNATURA ---");
                    System.out.println("Materia: " + asignatura1.getNombreMateria());
                    System.out.println("Aula: " + asignatura1.getAula());
                    System.out.println("Horas: " + asignatura1.getHoraMateria());
                    System.out.println("Total materias: " + asignatura1.getCantMaterias());
                    System.out.println("Nota: " + asignatura1.getNotaAlum());
                    break;
                    
                case 6:
                    asignatura1.ingresarDatosAsignatura();
                    System.out.println("Datos de la asignatura ingresados correctamente");
                    break;
                    
                case 0:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        scanner.close();
    }
}