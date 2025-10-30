import java.util.Scanner;
//punto 4
public class TP1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 3 números");
        int nro1 = scanner.nextInt();
        scanner.nextLine();
        int nro2 = scanner.nextInt();
        scanner.nextLine();
        int nro3 = scanner.nextInt();
        scanner.nextLine();

        if (nro1 > nro2 & nro1 > nro3){
            System.out.println("El mayor es " + nro1);
        } else {
            if (nro2 > nro1 & nro2 > nro3)
            System.out.println("El mayor es " + nro2);
            else
            System.out.println("El mayor es " + nro3);
        }
        scanner.close();
    }
    
}