import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        Random random = new Random();
        int lanzamientos = 1000000;
        int cara1 = 0, cara2 = 0, cara3 = 0, cara4 = 0, cara5 = 0, cara6 = 0;

        for (int i = 0; i < lanzamientos; i++) {
            int resultado = random.nextInt(6) + 1;
            switch (resultado) {
                    case 1:
                    cara1++;
                    break;
                    case 2:
                    cara2++;
                    break;
                    case 3:
                    cara3++;
                    break;
                    case 4:
                    cara4++;
                    break;
                    case 5:
                    cara5++;
                    break;
                    case 6:
                    cara6++;
                    break;
            }
        }
            System.out.println("Resultados:");
            double pCara1 = (cara1 / (double) lanzamientos) * 100;
            double pCara2 = (cara2 / (double) lanzamientos) * 100;
            double pCara3 = (cara3 / (double) lanzamientos) * 100;
            double pCara4 = (cara4 / (double) lanzamientos) * 100;
            double pCara5 = (cara5 / (double) lanzamientos) * 100;
            double pCara6 = (cara6 / (double) lanzamientos) * 100;
            System.out.println("Cara 1: " + cara1 + " (" + pCara1 + "%)");
            System.out.println("Cara 2: " + cara2 + " (" + pCara2 + "%)");
            System.out.println("Cara 3: " + cara3 + " (" + pCara3 + "%)");
            System.out.println("Cara 4: " + cara4 + " (" + pCara4 + "%)");
            System.out.println("Cara 5: " + cara5 + " (" + pCara5 + "%)");
            System.out.println("Cara 6: " + cara6 + " (" + pCara6 + "%)");
        }
    }
