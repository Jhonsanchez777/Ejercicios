import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pidiendo a el usuario que haga algo
        System.out.println("Ingrese un numero: ");
        //Para que el ususario digite
        int numero = scanner.nextInt();
        int resultado = (numero +10);
        System.out.println("El resultado es: "+ resultado);
    }
}
