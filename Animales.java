
public class Animales {
    public static void main(String[] args) {


        Perro perritPerro  = new Perro();
        Gato gatitoGato = new Gato();
        Caballo caballito = new Caballo();

        System.out.println(" ");
        System.out.println("Ejercicio 1:");

        System.out.println("-------------------------------------------------");
        System.out.println("El nombre del Caballo:" + caballito.getNombreCaballo());
        System.out.println("El nombre del Perro:" + perritPerro.getNombrePerro());
        System.out.println("El nombre del Gato:" + gatitoGato.getNombreGato());

        System.out.println(" ");

        System.out.println("Raza del Caballo:" + caballito.getRazaCaballo());
        System.out.println("Raza del Perro:" + perritPerro.getRazaPerro());
        System.out.println("Raza del Gato:" + gatitoGato.getRazaGato());

        System.out.println(" ");

        System.out.println("El pelaje del Caballo:" + caballito.getColorCaballo());
        System.out.println("El pelaje del Perro:" + perritPerro.getColorPerro());
        System.out.println("El pelaje del Gato:" + gatitoGato.getColorGato());
        System.out.println("-------------------------------------------------");

        System.out.println(" ");
        
        System.out.println("Ejercicio 2: ");
        System.out.println("¿Se puede instanciar un objeto de la clase Animal? ¿Cuántos?");
        System.out.println(" ");

        System.out.println("Depende de la implementación del codigo, puesto que cuando en nuestro caso: "); 
        System.out.println("hablamos una superclase Animal, por medio de abtraccion nos refereimos a elementos de distinta clase,");
        System.out.println("(perro, gato, caballo) que se pueden instanciar y que se heredan de la clase Animal, podemos instanciar");
        System.out.println("las que quisieramos; si obviamos la abstraccion, no se podria instanciar ningun objeto de la clase Animal");
        System.out.println("porque de por si, si nos referimos a una especie de animal sin especificar que tipo de animal es.");
        System.out.println("No sabriamos que atributos o metodos utilizar, por lo tanto no se podria instanciar ningun objeto.");
        System.out.println(" ");

    }   
}