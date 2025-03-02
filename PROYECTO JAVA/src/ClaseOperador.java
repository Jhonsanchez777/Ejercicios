import java.util.Scanner;

public class ClaseOperador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.print("ingrese el tercer numero: ");
        int numero3 = scanner.nextInt();

        boolean resultado= (numero1>numero2) & (numero1<numero3);
        System.out.println("¿¿El primer número es mayor que el segundo y menor que el tercero?" + resultado);

        }
}
