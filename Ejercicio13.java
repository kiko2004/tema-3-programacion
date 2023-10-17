import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        Random random = new Random();
        int lanzamientos = 1000000;
        int caras = 0;
        int cruces = 0;

        for (int i = 0; i < lanzamientos; i++) {
            int resultado = random.nextInt(2);
            if (resultado == 0) {
                caras++;
            } else {
                cruces++;
            }
        }
        double porcentajeCaras = (caras / (double) lanzamientos) * 100;
        double porcentajeCruces = (cruces / (double) lanzamientos) * 100
        System.out.println("Resultado:");
        System.out.println("Caras: " + caras + " (" + porcentajeCaras + "%)");
        System.out.println("Cruces: " + cruces + " (" + porcentajeCruces + "%)");
    }
}
