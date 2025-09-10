import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[1000];

        // CORRECCIÓN: Cambié "1 < array.length" por "i < array.length"
        for (int i = 0; i < array.length; i++) {
            System.out.println("Número en la posición: " + i);
            array[i] = scanner.nextInt();
        }

        // CORRECCIÓN: Cambié "array.length" por "array[i]" en el print
        for (int i = 0; i < array.length; i++) {
            System.out.println("En la posición: " + i + " esta el número: " + array[i]);
        }
        
        scanner.close(); // Buen práctica: cerrar el Scanner
    }
}