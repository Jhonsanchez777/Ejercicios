import java.util.Scanner;

public class Operadores {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce el primer número: ");
            double numero1 = scanner.nextDouble();
    
            System.out.print("Introduce el segundo número: ");
            double numero2 = scanner.nextDouble();
    
            System.out.println("¿numero1 es igual a numero2? " + (numero1 == numero2));
            System.out.println("¿numero1 es diferente de numero2? " + (numero1 != numero2));
            System.out.println("¿numero1 es mayor que numero2? " + (numero1 > numero2));
            System.out.println("¿numero1 es menor que numero2? " + (numero1 < numero2));
            System.out.println("¿numero1 es mayor o igual que numero2? " + (numero1 >= numero2));
            System.out.println("¿numero1 es menor o igual que numero2? " + (numero1 <= numero2));
        
    }
}