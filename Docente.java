import java.util.Scanner;

public class Docente {
    private String NombreDocente;          
    private String ApellidoDocente; 
    private String EspecialidadDocente;

    public Docente(String NombreDocente, String ApellidoDocente, String EspecialidadDocente) {
        this.NombreDocente = NombreDocente;
        this.ApellidoDocente = ApellidoDocente;
        this.EspecialidadDocente = EspecialidadDocente;
    }

    public Docente() {
        this.NombreDocente = "Sin Nombre";
        this.ApellidoDocente = "Sin Apellido";
        this.EspecialidadDocente = "Sin Especialidad";
    }

    public void ingresarDatosDocente() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del docente: ");
        this.NombreDocente = scanner.nextLine();
        
        System.out.println("Ingresa el apellido del docente: ");
        this.ApellidoDocente = scanner.nextLine();
        
        System.out.println("Ingresa la especialidad del docente: ");
        this.EspecialidadDocente = scanner.nextLine();
    }

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