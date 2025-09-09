public class Alumno {
    private String nombreAlumno;
    private String apellidoAlumno;
    private int edad;
    private String curso;
    private int cantMaterias;

    public Alumno(String nombreAlumno, String apellidoAlumno, String curso, int edad, int cantMaterias) {
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.curso = curso;
        this.edad = edad;
        this.cantMaterias = cantMaterias;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public int getCantMaterias() {
        return cantMaterias;
    }

}