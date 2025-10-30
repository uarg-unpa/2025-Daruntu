//Este main está hecho por los profes. Solo cambié el Console.readInt() por el scanner.

package Pilas;

import java.util.Scanner;

public class MenuPila {
    public static void main (String args[]){
    Scanner scanner = new Scanner(System.in);

    Pila pila = new Pila();
    int numero;
    int opcion = -1;

    do {
        System.out.println("Ingrese una opcion, con 0 Termina");
        System.out.println("1- Meter elemento");
        System.out.println("2- Sacar elemento");
        opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch(opcion){
            case 1:{
                System.out.println("Ingrese un entero: ");
                    numero = scanner.nextInt();
                    scanner.nextLine();
                        if (!pila.estaLlena())
                            pila.meter(numero);
                        else
                            System.out.println("La Pila esta llena!");
                break;
                }
            case 2:{
                if (!pila.estaVacia())
                    System.out.println("Se saco: "+ pila.sacar());
                else
                    System.out.println("Pila Vacía!");
                break;
                }
                }
    }while(opcion!=0);

    scanner.close();
    }
}
