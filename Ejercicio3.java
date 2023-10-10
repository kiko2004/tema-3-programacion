import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        int producto = 0;

        for (int i = 0; i < numero2; i++) {
            producto += numero1;
        }
        
        System.out.println("El producto de " + numero1 + " y " + numero2 + " es: " + producto);
        
        scanner.close();
   
   
    }
}



