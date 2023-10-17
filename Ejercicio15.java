import java.util.Scanner;
    public class Ejercicio15{
        public static void main(String[] args){
            Scanner lector = new Scanner(System.in);
            int Segundos = 0;
            int Minutos = 0;
            int Horas = 0;

            System.out.println("Dime una cantidad de horas");
            Horas = lector.nextInt();
            System.out.println("Dime una cantidad de minutos");
            Minutos = lector.nextInt();
            System.out.println("Dime una cantidad de segundos");
            Segundos = lector.nextInt();
            if (Horas > 24){
            System.out.println(Horas + " horas no es correcto");
            } else{
                System.out.println("Horas es correcto");
            }
            if (Minutos > 60){
            System.out.println(Minutos + " minutos no es correcto");
            } else{
                System.out.println("Minutos es correcto");
            }
            if (Segundos > 60){
            System.out.println(Segundos + " segundos no es correcto");      
            } else{
                System.out.println("Segundos es correcto");
            }




        }
    }