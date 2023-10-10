public class Ejercicio5 {
    public static void main(String[] args) {
        int cPares = 0;
        int sumPares = 0;
        int cImpares = 0;
        int sumImpares = 0;
        int cMultiplosDe5 = 0;
        int sumMultiplosDe5 = 0;

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero + " es par");
                cPares++;
                sumPares += numero;
            } else {
                System.out.println(numero + " es impar");
                cImpares++;
                sumImpares += numero;
            }
            if (numero % 5 == 0) {
                System.out.println(numero + " es múltiplo de 5");
                cMultiplosDe5++;
                sumMultiplosDe5 += numero;
            }
        }

        System.out.println("\nResumen:");
        System.out.println("Cantidad de números pares: " + cPares);
        System.out.println("Suma de números pares: " + sumPares);
        System.out.println("Cantidad de números impares: " + cImpares);
        System.out.println("Suma de números impares: " + sumImpares);
        System.out.println("Cantidad de números múltiplos de 5: " + cMultiplosDe5);
        System.out.println("Suma de números múltiplos de 5: " + sumMultiplosDe5);
  
  
  
  
  
  
  
    }
}