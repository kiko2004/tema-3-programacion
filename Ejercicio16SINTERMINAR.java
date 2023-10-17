import java.util.Scanner;
import java.util.Random;

public class Ejercicio16SINTERMINAR{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        Random Random = new Random();
        int dado = 0;
        int tiro;
        int porra1 = 0;
        int porra2 = 0;
        int jugador1;
        int jugador2;
        int lanzamiento;
        int contadoruno = 0, contadordos = 0, contadortres = 0, contadorcuatro = 0, contadorcinco = 0, contadorseis = 0;

        for (int i = 0; i < lanzamiento; i++){
            tiro = Random.nextInt(6) + 1;

            if (tiro == 1){
                contadoruno++;
            } else if (tiro == 2){
                contadordos++;
            }else if (tiro == 3){
                contadortres++;
            }else if (tiro == 4){
                contadorcuatro++;
            }else if (tiro == 5){
                contadorcinco++;
            }else {
                contadorseis++;
            }
        }
            dado = contadoruno + contadordos + contadortres + contadorcuatro + contadorcinco + contadorseis;
            System.out.println("Has sacado " + dado);





        System.out.println("Has sacado " + dado);
        if (dado == 11);
        System.out.println("¡Has ganado! (Sumas dos porras)");





























    }
    
}