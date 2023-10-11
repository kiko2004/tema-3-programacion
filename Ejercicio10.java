import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
       
        int num;
        int suma = 0;

        System.out.println("Introduce números:");
        do {
            num = lector.nextInt();
            suma += num;
        } while (num != 0);

        System.out.println("La suma es: " + suma);
    }
}