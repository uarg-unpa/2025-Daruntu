import java.util.Scanner;

public class TP1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese dia de la semana");
        String dia = scanner.next();
        
        dia = dia.toLowerCase();

        char day = dia.charAt(0);

        if (day == 'm' || day == 'i' || day == 'j') {
            System.out.println("Hoy tengo clases");
        } else if (day == 'l' || day == 'v' || day == 's' || day == 'd') {
            System.out.println("Hoy no tengo clases");
        } else {
            System.out.println("El caracter es inválido");
        }

        scanner.close();
    }
}