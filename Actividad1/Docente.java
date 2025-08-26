package Actividad1;
import java.util.Scanner;
public class Docente{
    Scanner scanner = new Scanner(System.in);
    //Atributos => Caracteristicas del Objeto
    private String NombreDocente;          
    private String ApellidoDocente; 
    private String EspecialidadDocente;


    //Constructor => Tipos de Atributos
    public Docente(String NombreDocente, String ApellidoDocente, String EspecialidadDocente) {
            this.NombreDocente = NombreDocente;
            this.ApellidoDocente = ApellidoDocente;
            this.EspecialidadDocente = EspecialidadDocente;
        }


     public Docente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del Docente: ");
        this.NombreDocente = scanner.nextLine();

        /* //Documentado
        System.out.println("ingresa el ApellidoDocente del docente: ");
        this.ApellidoDocente = scanner.nextLine();
        
        System.out.println("Ingresa la EspecialidadDocente del docente: ");
        this.EspecialidadDocente = scanner.nextLine();

        scanner.close();
       */
    }

        //Funciones del Objeto
        public String getNombreDocente() {
            return NombreDocente;
        }
        
        public String getApellidoDocente() {
            
            return ApellidoDocente;
        }
           
      public String getEspecialidadDocente() {
            return EspecialidadDocente;
        }
    }