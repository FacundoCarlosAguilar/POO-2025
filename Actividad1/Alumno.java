package Actividad1;
import java.util.Scanner;

public class Alumno {
    Scanner scanner = new Scanner(System.in);
        private String NombreAlumno; 
        private String ApellidoAlumno; 
        private int Edad;
        private String Curso;
        private int CantMaterias;
    
    //Constructor => Tipos de Atributos
    public Alumno(String NombreAlumno, String ApellidoAlumno, String Curso, int Edad, Scanner scanner) {
        this.NombreAlumno = " ";
        this.ApellidoAlumno = " ";
        this.Edad = 0;
        this.Curso = " ";
        
    }

        public Alumno() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa el nombre del alumno");
            this.NombreAlumno = scanner.nextLine();

            /*  //Documentado
            System.out.println("ingresa el ApellidoAlumnoAlumno del alumno: ");
            this.ApellidoAlumnoAlumno = scanner.nextLine();
        
            System.out.println("Ingresa la Edad del Alumno: ");
            this.Edad = scanner.nextInt();
        
            System.out.println("Ingresa la cantidad de materias que cursa: ");
            this.CantMaterias = scanner.nextInt();
            
            System.out.println("Ingresa el año de cursada: ");
            this.Curso = scanner.nextLine();

            */
    }
        
        public String getNombreAlumno() {
            return NombreAlumno;
        }

        public String getApellidoAlumno() {
            return ApellidoAlumno;
        }

        public int getEdad() {
            return Edad;
        }

        public String getCurso() {
            return Curso;
        }
}