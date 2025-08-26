import java.util.Scanner;

public class Asignatura {
    private String NombreMateria;
    private String Aula;
    private int HoraMateria;
    private int CantMaterias;
    private double NotaAlum;

    //Constructor / asignando valores por parametros
    public Asignatura(String NombreMateria, String Aula, int HoraMateria, int CantMaterias, double NotaAlum) {
        this.NombreMateria = NombreMateria;
        this.Aula = Aula;
        this.HoraMateria = HoraMateria;
        this.CantMaterias = CantMaterias;
        this.NotaAlum = NotaAlum;
    }

    //Constructor vacio / asignando valores por defecto
    public Asignatura() {
        this.NombreMateria = "Sin materia";
        this.Aula = "Sin aula";
        this.HoraMateria = 0;
        this.CantMaterias = 0;
        this.NotaAlum = 0.0;
    }

    //Setters / Metodos de modificacion
    public void ingresarDatosAsignatura() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre de la Matería: ");
        this.NombreMateria = scanner.nextLine();
        
        System.out.println("Ingresa el Aula de la Matería: ");
        this.Aula = scanner.nextLine();
        
        System.out.println("Ingresa la cantidad de horas de la Matería: ");
        this.HoraMateria = scanner.nextInt();
        
        System.out.println("Ingresa la cantidad de materias totales: ");
        this.CantMaterias = scanner.nextInt();
        
        System.out.println("Ingrese la nota del alumno: ");
        this.NotaAlum = scanner.nextDouble();
    }

    //Getters / Metodos de acceso
    public String getNombreMateria() {
        return NombreMateria;
    }

    public String getAula() {
        return Aula;
    }

    public int getHoraMateria() {
        return HoraMateria;
    }
    
    public int getCantMaterias() {
        return CantMaterias;
    }

    public double getNotaAlum() {
        return NotaAlum;
    }
}