// CLASE MAIN PARA PROBAR
public class MainPrincipal{
    public static void main(String[] args) {
        System.out.println("Creando animales con HERENCIA...\n");
        
        // Crear animales usando herencia
        
        // Crear animales usando herencia
        Gato gato = new Gato("Whiskers", "Siamés", "Blanco", "Macho", 3, "Agudo", 7);
        Perro perro = new Perro("Max", "Labrador", "Dorado", "Macho", 5, "Grande", true);
        Caballo caballo = new Caballo("Pony", "Landrance", "Blanco", "MAcho", 16);

        System.out.println("=== INFORMACIÓN DE LOS ANIMALES ===");
        System.out.println("1. " + "gato");
        System.out.println("2. " + "perro");
        System.out.println("3. " + "caballo");

        System.out.println("\n=== COMPORTAMIENTOS COMUNES (de la superclase) ===");
        gato.comer();
        perro.comer();
        caballo.comer();

        System.out.println("\n=== COMPORTAMIENTOS ESPECÍFICOS (de cada subclase) ===");
        System.out.println("--- GATO ---");
        gato.maullar();
        gato.ronronear();
        
        
        System.out.println("--- PERRO ---");
        perro.ladrar();
        perro.moverCola();
        
        System.out.println("---CABALLO---");
        caballo.relinchar();
        caballo.cabalgar();
        

        System.out.println("\n=== DEMOSTRACIÓN DE HERENCIA ===");
        System.out.println("Nombre del gato: " + gato.getNombre());
        System.out.println("Edad del perro: " + perro.getEdad() + " años");
        System.out.println("Raza de todos: " + gato.getRaza() + ", " + perro.getRaza() + ", " + caballo.getRaza());

        System.out.println("\n=== ATRIBUTOS ESPECÍFICOS ===");
        System.out.println("Tono de maullido del gato: " + gato.getTonoMaullido());
        System.out.println("Vidas del gato: " + gato.getVidas());
        System.out.println("Tamaño del perro: " + perro.getTamaño());
        System.out.println("¿El perro está adiestrado? " + perro.isEsAdiestrado());
        System.out.println("¿cual es la edad del caballo? " + caballo.getEdad());
    }
}