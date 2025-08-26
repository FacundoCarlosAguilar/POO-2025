public class Perro {
    private String NombrePerro;
    private int edadPerro;
    private String razaPerro;
    private String ColorPerro;
    private String SexoPerro;
        
    // Constructor
    public Perro (String NombrePerro, int edadPerro, String razaPerro, String ColorPerro, String SexoPerro){
        this.NombrePerro = NombrePerro;
        this.edadPerro = edadPerro; 
        this.razaPerro = razaPerro;
        this.ColorPerro = ColorPerro;
        this.SexoPerro = SexoPerro;

    }
    // Constructor vacío
    public Perro(){
        this.NombrePerro = " Pepito";
        this.edadPerro = 12; 
        this.razaPerro = " Chihuahua";
        this.ColorPerro = " Marrón";
        this.SexoPerro = " Masculino";

    }

    // Métodos getters

     public String getNombrePerro(){
        return NombrePerro;
    }

    public int getEdadPerro(){
        return edadPerro;
    }
    public String getRazaPerro(){
        return razaPerro;
    }
    public String getColorPerro(){
        return ColorPerro;
    }
    public String getSexoPerro(){
        return SexoPerro;
    }
    
}
