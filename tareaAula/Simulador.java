import java.util.Scanner;
public class Simulador{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre de su nave.");
        String name = scanner.nextLine();
        System.out.println("Ingrese la velocidad.");
        double speed = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese combustible: ");
        double fuel = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese el destino: ");
        String destiny = scanner.nextLine();

        NaveEspacial n1 = new NaveEspacial(name, speed, fuel, destiny);

        System.out.println(" ");
        System.out.println("- Informe inicial -");
        n1.mostrarInforme();

        if (n1.puedeLlegar()) {
            System.out.println(n1.getNOMBRE() + " puede completar la misión.");
            n1.acelerar();
            System.out.println(" ");
            System.out.println("- Informe final -");
            n1.mostrarInforme();
        }   else {
                System.out.println("No puede completar la misión.");
            }

        scanner.close();
    }
}