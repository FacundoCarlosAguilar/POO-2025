// SUBCLASE PAJARO
class Caballo extends Animal {
    private String TipoPelaje;
    private boolean cabalgar;
    private int edad;

    public Caballo(String nombre, String raza, String color, String sexo, int edad) {
        super(nombre, raza, color, sexo, edad);
        this.TipoPelaje = TipoPelaje;
        this.cabalgar = cabalgar;
        this.edad = edad;
    }

    // Métodos específicos de Pájaro
    public void relinchar() {
        System.out.println(getNombre() + " está relinchando...");
    }

    public void cabalgar() {
        if (cabalgar) {
            System.out.println(getNombre() + " esta quieto");
        } else {
            System.out.println(getNombre() + " está cabalgando en la pradera");
        }
    }
}