//Agregar a la clase Pila el método elementoCima() que retorne el elemento cima sin cambiar la pila. 

package Pilas;
import java.util.Scanner;
public class TestPila{
    public static void main (String args[]){
    Scanner scanner = new Scanner(System.in);

    Pila2 pila = new Pila2();
    int opcion;
    int numero;

    boolean continuar = true;

    while (continuar){
        System.out.println("\n¿Qué quiere hacer? Elija una opción (1, 2 ó 3)");
        System.out.println("\n1- Meter un elemento.");
        System.out.println("\n2- Sacar elemento.");
        System.out.println("\n3- Mostrar cima.");
        opcion = scanner.nextInt();
        scanner.nextLine();

            switch(opcion){
                case 1:{
                    if (!pila.estaLlena()){
                        System.out.println("\nIngrese elementos a la pila: ");
                            numero = scanner.nextInt();
                            scanner.nextLine();
                            pila.meter(numero);
                            System.out.println("\nSe ingresó el elemento: " + numero);     
                    }else{
                        System.out.println("\nPila llena, no puede meter más elementos.");
                    }
                    break;
                }
                case 2:{
                    if (!pila.estaVacia()){
                        System.out.println("\nSe sacó el elemento: "+ pila.sacar());
                    }else{
                            System.out.println("\nPila vacía, no puede sacar elementos.");
                    }
                    break;
                }
                case 3:{
                    if (!pila.estaVacia()){
                        System.out.println("\nCima: " + pila.elementoCima());
                    }else{
                        System.out.println("\nPila vacía. Se deben ingresar elementos.");
                    }
                    break;
                }
                default:
                    System.out.println("Opción no válida.");
            }

        System.out.print("\n¿Terminar programa? (S/N): ");
            char salir = scanner.next().toUpperCase().charAt(0);
            if (salir == 'S') {
                continuar = false;
            }
    }
    scanner.close();

    }
}