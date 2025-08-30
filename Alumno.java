
public class Alumno {
    private String NombreAlumno;
    private String ApellidoAlumno;
    private int Edad;
    private String Curso;
    private int CantMaterias;


    public Alumno(String NombreAlumno, String ApellidoAlumno, String Curso, int Edad, int CantMaterias) {
        this.NombreAlumno = NombreAlumno;
        this.ApellidoAlumno = ApellidoAlumno;
        this.Curso = Curso;
        this.Edad = Edad;
        this.CantMaterias = CantMaterias;


        
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

    public int getCantMaterias() {
        return CantMaterias;
    }
}