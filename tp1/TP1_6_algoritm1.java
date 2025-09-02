import java.util.Scanner;
public class TP1_6_algoritm1 {
    public static void main (String [] args) {
        //algoritmo 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres números enteros");

        int num1 = scanner.nextInt();
        scanner.nextLine();
        int num2 = scanner.nextInt();
        scanner.nextLine();
        int num3 = scanner.nextInt();
        scanner.nextLine();
        
        int producto = num1 * num2 * num3;
        int suma = num1 + num2 + num3;

        System.out.println("Producto de enteros: " + producto);
        System.out.println("Suma de enteros: " + suma);
        
        scanner.close();                

    }
}
