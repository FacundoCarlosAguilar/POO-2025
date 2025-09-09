// SUBCLASE PERRO
class Perro extends Animal {
    private String tamaño;
    private boolean esAdiestrado;

    public Perro(String nombre, String raza, String color, String sexo, int edad, String tamaño, boolean esAdiestrado) {
        super(nombre, raza, color, sexo, edad);
        this.tamaño = tamaño;
        this.esAdiestrado = esAdiestrado;
    }

    // Métodos específicos de Perro
    public void ladrar() {
        System.out.println(getNombre() + " está ladrando: ¡Guau! ¡Guau!");
    }

    public void moverCola() {
        System.out.println(getNombre() + " está moviendo la cola felizmente");
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isEsAdiestrado() {
        return esAdiestrado;
    }

    public void setEsAdiestrado(boolean esAdiestrado) {
        this.esAdiestrado = esAdiestrado;
    }
}