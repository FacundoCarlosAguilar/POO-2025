// SUBCLASE GATO
class Gato extends Animal {
    private String tonoMaullido;
    private int vidas;

    public Gato(String nombre, String raza, String color, String sexo, int edad, String tonoMaullido, int vidas) {
        super(nombre, raza, color, sexo, edad);
        this.tonoMaullido = tonoMaullido;
        this.vidas = vidas;
    }

    // Métodos específicos de Gato
    public void maullar() {
        System.out.println(getNombre() + " está maullando con tono: " + tonoMaullido);
    }

    public void ronronear() {
        System.out.println(getNombre() + " está ronroneando... purrrr");
    }

    public String getTonoMaullido() {
        return tonoMaullido;
    }

    public void setTonoMaullido(String tonoMaullido) {
        this.tonoMaullido = tonoMaullido;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}