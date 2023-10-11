import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int num;
        int suma = 0;
        int cantidadNum = 0;

        System.out.println("Introduce números, introduce uno negativo para calcular la media:");

        do {
            num = inputScanner.nextInt();

            if (num < 0) {
                break;
            }
            suma += num;
            cantidadNum++;
        } while (true);

        if (cantidadNum > 0) {
            double media = (double) suma / cantidadNum;
            System.out.println("La media de los números es: " + media);
        }
    }
}