import java.util.Scanner;
import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int intentos;
        int numero;
        int intentosHechos = 0;

        System.out.print("Introduce el número de intentos: ");
        intentos = scanner.nextInt();

        numero = random.nextInt(100) + 1;

        System.out.println("Adivina numero entre 1 y 100 Tienes " + intentos + " intentos");

        while (intentosHechos < intentos) {
            System.out.print("Intento #" + (intentosHechos + 1) + ": ");
            int intento = scanner.nextInt();

            if (intento == numero) {
                System.out.println("Has adivinado el numero");
                break;
            } else if (intento < numero) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
            intentosHechos++;
        }

        if (intentosHechos == intentos) {
            System.out.println("¡Agotaste tus intentos! El número a adivinar era " + numero);
        }
        scanner.close();
    }
}