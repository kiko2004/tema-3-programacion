public class Ejercicio4{
    public static void main(String[] args) {
        int Impares = 0;
        
        for (int i = 1; i <= 100; i++) {
            
            if (i % 2 != 0) {
                
                System.out.println(i); 
                Impares++; 
            }
        }
        
        System.out.println("números impares: " + Impares);
   
   
   
   
   
   
    }
}