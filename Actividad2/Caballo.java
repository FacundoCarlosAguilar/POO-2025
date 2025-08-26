package Actividad2;
public class Caballo {
    private String NombreCaballo;
    private int EdadCaballo;
    private String RazaCaballo;
    private String ColorCaballo;
    private String SexoCaballo;

    // Constructor vacio
    public Caballo(){
        this.NombreCaballo = " Sponia ";
        this.EdadCaballo = 18 ;
        this.RazaCaballo = " Pastor";
        this.ColorCaballo = " Marron";
        this.SexoCaballo = " Hembra";
    }
    
    // Constructor
    public Caballo(String NombreCaballo, int EdadCaballo, String RazaCaballo, String ColorCaballo, String SexoCaballo) {
        this.NombreCaballo = NombreCaballo;
        this.EdadCaballo = EdadCaballo;
        this.RazaCaballo = RazaCaballo;
        this.ColorCaballo = ColorCaballo;
        this.SexoCaballo = SexoCaballo;
    }
    
    // Getters
    public String getNombreCaballo() {
        return NombreCaballo;
    }
    public int getEdadCaballo() {
        return EdadCaballo;
    }
    public String getRazaCaballo() {
        return RazaCaballo;
    }
    public String getColorCaballo() {
        return ColorCaballo;
    }
    public String getSexoCaballo() {
        return SexoCaballo;
    }

}