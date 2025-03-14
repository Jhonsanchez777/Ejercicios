import java.util.Scanner;

public class Ejercicio1Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int num= input.nextInt();
        if (num<=0) {
            System.out.println("El numero ingresado no es valido");
            input.close();
            return;
        }


        for(int i=num; i>=1; i--){
            for (int espacio=1; espacio<i; espacio++) {
                System.out.println("  "); //print
            }
                for (int j=i; j<=num; j++) {
                    System.out.println(j+"  "); //print
                }
                    for (int j=num-1; j>=i; j--) {
                        System.out.println(j+" "); //print
                    }
                        System.out.println();
        }
        input.close();
    }
}