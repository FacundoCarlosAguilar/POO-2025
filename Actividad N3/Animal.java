// SUPERCLASE ANIMAL
class Animal {
    
    // Atributos comunes a todos los animales
    private String nombre;
    private String raza;
    private String color;
    private String sexo;
    private int edad;

    // Constructor
    public Animal(String nombre, String raza, String color, String sexo, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método común a todos los animales
    public void comer() {
        System.out.println(nombre + " está comiendo...");
    }
}