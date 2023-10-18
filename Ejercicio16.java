import java.util.Scanner;
import java.util.Random;

public class Ejercicio16 {
    public static void main(String[] args) {
        int lanzamientos = 1;
        int dado = 0;
        int porraJugador = 0;
        int porraOrdenador = 0;
        int puntos = 11;
        int porrasGanar = 5;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Bienvenido al blackjack. El objetivo es estar lo más cerca posible de 11 puntos sin pasarse.");

        while (porraJugador < porrasGanar && porraOrdenador < porrasGanar) {
            dado = 0;
            int dadoComputadora = 0;

            for (int i = 0; i < lanzamientos; i++) {
                int tiro = random.nextInt(6) + 1;
                dado += tiro;

                switch (tiro) {
                    case 1:
                    break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                            if (dado == puntos)
                            porraJugador += 2;
                            else if (dado > puntos)
                            porraOrdenador++;
                            break;
                }

                System.out.println("Has sacado " + tiro + ". Tu puntuación es " + dado);

                if (dado >= puntos)
                break;

                System.out.print("¿Quieres tirar otra vez (s/n)?: ");
                String respuesta = scanner.next();

                if (respuesta.equalsIgnoreCase("n"))
                break;
            
        }

            if (dado < puntos) {
                while (dadoComputadora < dado && dadoComputadora < puntos) {
                    int tiro = random.nextInt(6) + 1;
                    dadoComputadora += tiro;
                    }

                if (dadoComputadora == dado)
                    porraOrdenador++;
                else if (dadoComputadora == puntos)
                    porraOrdenador += 2;
                else
                    porraJugador++;
                
                System.out.println("\nPorras - Jugador: " + porraJugador + " | Computadora: " + porraOrdenador);
                System.out.println("La computadora ha sacado " + dadoComputadora + ".\n");
                }

                if (porraJugador >= porrasGanar) {
                    System.out.println("¡Has ganado la partida!");
                } else if (porraOrdenador >= porrasGanar) {
                    System.out.println("La computadora ha ganado la partida.");
                }
        }
    }
}
