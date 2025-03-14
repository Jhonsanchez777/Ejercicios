public class Contadores {
    public static void main(String[] args) {
        
        int pares = 0;

        for (int i= 1; i <= 100 ; i++) {
            if (i % 2==0) {
                pares++;
            }
        System.out.println("Los numeros pares son "+ pares);
        }
    }
}
