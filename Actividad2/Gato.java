package Actividad2;
public class Gato {
    private String NombreGato;
    private int EdadGato;
    private String RazaGato;
    private String ColorGato;
    private String SexoGato;

    public Gato(String NombreGato, int EdadGato, String RazaGato, String ColorGato, String SexoGato) {
        this.NombreGato = NombreGato;
        this.EdadGato = EdadGato;
        this.RazaGato = RazaGato;
        this.ColorGato = ColorGato;
        this.SexoGato = SexoGato;
    }

    public Gato() {
        this.NombreGato = " Leon";
        this.EdadGato =  5 ;
        this.RazaGato = " Siames";
        this.ColorGato = " Blanco y Negro ";
        this.SexoGato = " Macho ";
    }

    public String getNombreGato() {
        return NombreGato;
    }   
    public int getEdadGato() {
        return EdadGato;
    }
    public String getRazaGato() {
        return RazaGato;
    }   
    public String getColorGato () {
        return ColorGato;

    }
    public String getSexoGato() {
        return SexoGato;
    }   

    
}
