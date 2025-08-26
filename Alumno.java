import java.util.Scanner;

public class Alumno {
    private String NombreAlumno; 
    private String Apellido; 
    private int Edad;
    private String Curso;
    private int CantMaterias;

    public Alumno(String NombreAlumno, String Apellido, String Curso, int Edad, int CantMaterias) {
        this.NombreAlumno = NombreAlumno;
        this.Apellido = Apellido;
        this.Curso = Curso;
        this.Edad = Edad;
        this.CantMaterias = CantMaterias;
    }

    public Alumno() {
        this.NombreAlumno = "Sin nombre";
        this.Apellido = "Sin apellido";
        this.Curso = "Sin curso";
        this.Edad = 0;
        this.CantMaterias = 0;
    }

    public void ingresarDatosAlumno() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del alumno: ");
        this.NombreAlumno = scanner.nextLine();
        
        System.out.println("Ingresa el apellido del alumno: ");
        this.Apellido = scanner.nextLine();
        
        System.out.println("Ingresa la edad del alumno: ");
        this.Edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        System.out.println("Ingresa el curso del alumno: ");
        this.Curso = scanner.nextLine();
        
        System.out.println("Ingresa la cantidad de materias: ");
        this.CantMaterias = scanner.nextInt();
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
    
    public int getCantMaterias() {
        return CantMaterias;
    }
}