
public class Asignatura {
    private String NombreMateria;
    private String Aula;
    private int HoraMateria;
    private int CantidadMaterias;
    private double NotaAlumno;

    public Asignatura(String NombreMateria, String Aula, int HoraMateria, int CantidadMaterias, double NotaAlumno) {
        this.NombreMateria = NombreMateria; 
        this.Aula = Aula;  
        this.HoraMateria = HoraMateria;
        this.CantidadMaterias = CantidadMaterias;
        this.NotaAlumno = NotaAlumno;  
    }
    
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
        return CantidadMaterias;
    }

    public double NotaAlumno() {  
        return NotaAlumno;
    }
}