import java.util.Scanner;
import java.util.Random;

public class Ejercicio16SINTERMINAR {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int lanzamientos = 2;
            int dado = 0;
            int porra1 = 0;
            int porra2 = 0;
            int jugador1;
            int jugador2;
            int cara1 = 0, cara2 = 0, cara3 = 0, cara4 = 0, cara5 = 0, cara6 = 0;

        for (int i = 0; i < lanzamientos; i++) {
            int tiro = random.nextInt(6) + 1;
            switch (tiro) {
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
            dado += tiro; 
        }

        System.out.println("Has sacado " + dado);

        if (dado == 11) { 
            System.out.println("¡Has ganado! (Sumas dos porras)");
        }
    }
}





























    }
    
}
