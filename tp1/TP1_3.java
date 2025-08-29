import java.util.Scanner;
public class TP1_3 {
    public static void main (String [] args){
         Scanner scanner = new Scanner(System.in);

         System.out.println("Ingrese 3 enteros");
        int A = scanner.nextInt();
        scanner.nextLine();
        int B = scanner.nextInt();
        scanner.nextLine();
        int C = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Los valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);

        int aux = A;
        A = C;
        C = aux;
        B = aux;
        System.out.println("Los valores finales son: ");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        
    }
}