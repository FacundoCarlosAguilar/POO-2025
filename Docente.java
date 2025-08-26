import java.util.Scanner;

public class Docente{
    Scanner scanner = new Scanner(System.in);
    //Atributos => Caracteristicas del Objeto
    private String Nombre;          
    private String Apellido; 
    private String Especialidad;
    private int Edad;


    //Constructor => Tipos de Atributos
    public Docente(String Nombre, String Apellido, String Especialidad, int Edad) {
            this.Nombre = Nombre;
            this.Apellido = Apellido;
            this.Especialidad = Especialidad;
            this.Edad = Edad;
        }


     public Docente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del docente: ");
        this.Nombre = scanner.nextLine();

        /* //Documentado
        System.out.println("ingresa el apellido del docente: ");
        this.Apellido = scanner.nextLine();
        
        System.out.println("Ingresa la especialidad del docente: ");
        this.Especialidad = scanner.nextLine();
        
        System.out.println("Ingresa la edad del docente: ");
        this.Edad = scanner.nextInt();

        scanner.close();
       */
    }

        //Funciones del Objeto
        public String getNombre() {
            return Nombre;
        }
        
        public String getApellido() {
            
            return Apellido;
        }
           
      public String getEspecialidad() {
            return Especialidad;
        }
        
        public int getEdad() {
            return Edad;

        }
    }