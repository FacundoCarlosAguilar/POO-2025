import java.util.Scanner;

public class Asignatura {
        //atributos
        private String NombreMateria;
        private String Aula;
        private int HoraMateria;
        private int CantMaterias;
        private double NotaAlum;


        //Constructor => Tipos de Atributos
        public Asignatura (String NombreMateria, String Aula, int HoraMateria, int CantMaterias, int NotaAlum) {
            this.NombreMateria = NombreMateria;
            this.Aula = Aula;
            this.CantMaterias = CantMaterias;
            this.HoraMateria = HoraMateria;
            this.NotaAlum = NotaAlum;
        }

    public Asignatura() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la Matería: ");
        this.NombreMateria = scanner.nextLine();

        /* //Documentado
        System.out.println("ingresa el Aula de la Matería: ");
        this.Aula = scanner.nextLine();
        
        System.out.println("Ingresa la cantidad de horas de la Matería: ");
        this.HoraMateria = scanner.nextInt();
        
        System.out.println("Ingresa la cantidad de materias totales");
        this.CantMaterias = scanner.nextInt();

        System.out.println("Ingrese la nota del alumno");
        this.NotaAlum = scanner.nextInt();      
    
        */
    }

        //Funciones del Objeto
        public String getNombreMateria() {
            return NombreMateria;
        }

        public String getAula() {
            return Aula;
        }

        public int gestHoraMateria() {
            return HoraMateria;
        }
        
        public int getCantMaterias() {
            return CantMaterias;
        }

        public double getAlum () {
            return NotaAlum;
        }


    }
