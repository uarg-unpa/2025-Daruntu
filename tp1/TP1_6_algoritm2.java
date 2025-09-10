import java.util.Scanner;
public class TP1_6_algoritm2 {
    public static void main (String [] args) {
        //algoritmo 2
        Scanner scanner = new Scanner(System.in);

        int producto = 1;
        int suma = 0;
        int cont = 1;

        System.out.println("Ingrese tres números enteros");
        
        while (cont <=3){
            int num = scanner.nextInt();
            suma = suma + num;
            producto = producto + num;
            cont = cont + 1;
        }

        System.out.println("Suma de enteros: " + suma);
        System.out.println("Producto de enteros: " + producto);    
        
        scanner.close();                
    }
}
