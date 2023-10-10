import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número real (base): ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el número entero (exponente): ");
        int exponente = scanner.nextInt();
        double resultado = calcularPotencia(base, exponente);
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
    
    public static double calcularPotencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            base = 1 / base;
            exponente = -exponente;
        }
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
   
   
   
   
   
   
    }
}