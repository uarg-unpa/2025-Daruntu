    /*4. En base a la implementación Frente y Final movible, escribir un método CONTAR que devuelva la
cantidad de elementos en la cola. Nota: no olvidar que, si bien la cola se implementa como un arreglo,
no debería manejarse como tal.*/

package Colas;

import java.util.Scanner;

public class colaCircular {
    private final int maxcola=10;
	private int[] elementos;
	private int frente, ultimo;
	
	public colaCircular(){
		elementos = new int[maxcola];
		frente=0;
		ultimo=0;
	}
	
	public boolean estaVacia(){
		return (ultimo == frente);
	}
   
	public boolean estaLlena(){
		int sigUltimo=siguiente(ultimo);
		return (sigUltimo == frente);
	}
	
	private int siguiente(int subind){
		if (subind == maxcola -1)
			return 0;
		else
			return ++subind;
	}
	
	public void insertar(int elem){		
		ultimo =siguiente(ultimo);
		elementos[ultimo]=elem;		
	}
	
	public int borrar(){
		frente =siguiente(frente);
		return elementos[frente];
	}
    //Método que cuenta los elementos de la cola.
	public int contar(){
			int contador = 0;
			int i = siguiente(frente);
			while (i != siguiente(ultimo)){
				contador++;
				i = siguiente(i);
			}
			return contador;      
	}

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        colaCircular cola = new colaCircular();

        int opcion;
        int numero;

        boolean continuar = true;

        while (continuar){
            System.out.println("\n----MENU COLA----");
            System.out.println("\n¿Qué quiere hacer? Elija una opción (1,2 ó 3)");
            System.out.println("\n1- Meter un elemento.");
            System.out.println("\n2- Borrar elemento.");
            System.out.println("\n3- Contar elementos.");
            opcion = scanner.nextInt();
            scanner.nextLine();

                switch(opcion){
                    case 1:{
                        if (!cola.estaLlena()){
                            System.out.println("\nIngrese elementos a la cola: ");
                                numero = scanner.nextInt();
                                scanner.nextLine();
                                cola.insertar(numero);
                                System.out.println("\nSe ingresó el elemento: " + numero);     
                        }else{
                            System.out.println("\nCola llena, no puede meter más elementos.");
                        }
                        break;
                    }
                    case 2:{
                        if (!cola.estaVacia()){
                            System.out.println("\nSe borró el elemento: "+ cola.borrar());
                        }else{
                                System.out.println("\nCola vacía, no puede borrar elementos.");
                        }
                        break;
                    }
                    case 3:{
                        if(!cola.estaVacia()){
                            System.out.println("\nNúmero de elementos en la cola: " + cola.contar());
                        }else{
                            System.out.println("\nCola vacía, no hay elementos que contar.");
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

