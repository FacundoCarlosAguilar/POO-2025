import java.util.Scanner;

public class Docente {
    private String NombreDocente;          
    private String ApellidoDocente; 
    private String EspecialidadDocente;
    
    //Constructor / asignado valores por defecto
    public Docente(String NombreDocente, String ApellidoDocente, String EspecialidadDocente) {
        this.NombreDocente = NombreDocente;
        this.ApellidoDocente = ApellidoDocente;
        this.EspecialidadDocente = EspecialidadDocente;
    }

    //Constructor vacio / asignardo valores por defecto
    public Docente() {
        this.NombreDocente = "Sin Nombre";
        this.ApellidoDocente = "Sin Apellido";
        this.EspecialidadDocente = "Sin Especialidad";
    }

    //Setters / Metodos de modificacion
    public void ingresarDatosDocente() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del docente: ");
        this.NombreDocente = scanner.nextLine();
        
        System.out.println("Ingresa el apellido del docente: ");
        this.ApellidoDocente = scanner.nextLine();
        
        System.out.println("Ingresa la especialidad del docente: ");
        this.EspecialidadDocente = scanner.nextLine();
    }
    //Getters / Metodos de acceso
    public String getNombreDocente() {
        return NombreDocente;
    }
    
    public String getApellidoDocente() {
        return ApellidoDocente;
    }
       
    public String getEspecialidad() {
        return EspecialidadDocente;
    }
}