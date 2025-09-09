public class Asignatura {
    private String nombreMateria;
    private String aula;
    private int horaMateria;
    private int cantMaterias;
    private double notaAlum;

    public Asignatura(String nombreMateria, String aula, int horaMateria, int cantMaterias, double notaAlum) {
        this.nombreMateria = nombreMateria;
        this.aula = aula;
        this.horaMateria = horaMateria;
        this.cantMaterias = cantMaterias;
        this.notaAlum = notaAlum;
    }
    
    public String getNombreMateria() {
        return nombreMateria;
    }

    public String getAula() {
        return aula;
    }

    public int getHoraMateria() {
        return horaMateria;
    }

    public int getCantMaterias() {
        return cantMaterias;
    }

    public double getNotaAlum() {
        return notaAlum;
    }

}