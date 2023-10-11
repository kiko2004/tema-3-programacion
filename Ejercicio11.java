import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double num;
        double suma = 0;
        double cantidadNum = 0;
        double media;
        
        System.out.println("Introduce números, introduce uno negativo para calcular la media:");

        do {
            num = Scanner.nextDouble();

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
