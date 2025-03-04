import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrresa el primer numero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("ingrresa el segundo numero: ");
        int num2 = scanner.nextInt();
      
        int suma = (num1 + num2);
        System.out.println( "el resultado de suma es igual a: " + suma);
        scanner.close();
    }
}
