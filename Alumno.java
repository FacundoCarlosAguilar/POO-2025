import java.util.Scanner;

public class Alumno {
    Scanner scanner = new Scanner(System.in);
        private String NombreAlumno; 
        private String Apellido; 
        private int Edad;
        private String Curso;
        private int CantMaterias;
    
    //Constructor => Tipos de Atributos
    public Alumno(String NombreAlumno, String Apellido, String Curso, int Edad, Scanner scanner) {
        this.NombreAlumno = " ";
        this.Apellido = " ";
        this.Edad = 0;
        this.Curso = " ";
        
    }

        public Alumno() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa el nombre del alumno");
            this.NombreAlumno = scanner.nextLine();

            /*  //Documentado
            System.out.println("ingresa el Apellido del alumno: ");
            this.Apellido = scanner.nextLine();
        
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

        public String getApellido() {
            return Apellido;
        }

        public int getEdad() {
            return Edad;
        }

        public String getCurso() {
            return Curso;
        }
}