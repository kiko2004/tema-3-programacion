import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número del 1 al 10: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero del 1 al 10.");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
   
   
   
   
   
   
   
    }
}