import java.util.Scanner;

public class MayorTresNúmeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce el primer numero");
        int numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo numero");
        int numero2 = scanner.nextInt();

        System.out.println("Introduce el tercer numero");
        int numero3 = scanner.nextInt();
        scanner.close();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero mayor de todos es: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mayor de todos es: " + numero2);
        } else {
            System.out.println("El numero m<yor de todos es: " + numero3);
        }

    }
}
