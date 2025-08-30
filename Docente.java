
public class Docente {
    private String NombreDocente;
    private String ApellidoDocente;
    private int EdadDocente;

    public Docente(String NombreDocente, String ApellidoDocente, int EdadDocente) {
        this.NombreDocente = NombreDocente;
        this.ApellidoDocente = ApellidoDocente;
        this.EdadDocente = EdadDocente;
    }

    public String getNombreDocente() {
        return NombreDocente;
    }

    public String getApellidoDocente() {
        return ApellidoDocente;
    }

    public int getEdadDocente() {
        return EdadDocente;
    }
}