public class Docente {
    private String nombreDocente;
    private String apellidoDocente;
    private int edadDocente;

    public Docente(String nombreDocente, String apellidoDocente, int edadDocente) {
        this.nombreDocente = nombreDocente;
        this.apellidoDocente = apellidoDocente;
        this.edadDocente = edadDocente;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public int getEdadDocente() {
        return edadDocente;
    }

}