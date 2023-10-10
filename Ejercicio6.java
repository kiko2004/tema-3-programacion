import java.util.Scanner;
    public class Ejercicio6{
        public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int num1;
        int i;
        System.out.println("Dime una tabla de multiplicar que quieras saber del 1 al 10");
        num1 = lector.nextInt();

    if (num1 == 1) {
            System.out.println("Tabla del 1");
            for ( i = 1; i <= 10; i++) {
                System.out.println("1 x " + i + " = " + (1 * i));
            }
        } else if (num1 == 2) {
            System.out.println("Tabla del 2");
            for ( i = 1; i <= 10; i++) {
                System.out.println("2 x " + i + " = " + (2 * i));
            }
        } else if (num1 == 3) {
            System.out.println("Tabla del 3");
            for ( i = 1; i <= 10; i++) {
                System.out.println("3 x " + i + " = " + (3 * i));
            }
        } else if (num1 == 4) {
            System.out.println("Tabla del 4");
            for ( i = 1; i <= 10; i++) {
                System.out.println("4 x " + i + " = " + (4 * i));
            }
        } else if (num1 == 5) {
            System.out.println("Tabla del 5");
            for ( i = 1; i <= 10; i++) {
                System.out.println("5 x " + i + " = " + (5 * i));
            }
        } else if (num1 == 6) {
            System.out.println("Tabla del 6");
            for ( i = 1; i <= 10; i++) {
                System.out.println("6 x " + i + " = " + (6 * i));
            }
        } else if (num1 == 7) {
            System.out.println("Tabla del 7");
            for ( i = 1; i <= 10; i++) {
                System.out.println("7 x " + i + " = " + (7 * i));
            }
        } else if (num1 == 8) {
            System.out.println("Tabla del 8");
            for ( i = 1; i <= 10; i++) {
                System.out.println("8 x " + i + " = " + (8 * i));
            }
        } else if (num1 == 9) {
            System.out.println("Tabla del 9");
            for ( i = 1; i <= 10; i++) {
                System.out.println("9 x " + i + " = " + (9 * i));
            }
        } else if (num1 == 10) {
            System.out.println("Tabla del 10");
            for ( i = 1; i <= 10; i++) {
                System.out.println("10 x " + i + " = " + (10 * i));
            }
        }
    }
    }
