/*5. Agregar un método en la clase Cola que elimine los elementos repetidos de la cola. */

package Colas;

import java.util.Arrays;
import java.util.Scanner;

public class colaRepetida {
    private final int maxcola=5;
	private int[] elementos;
    private int [] colaRep;
	private int frente, ultimo;
	
	public colaRepetida(){
		elementos = new int[maxcola];
        colaRep = new int [maxcola];
		frente=-1;
		ultimo=-1;
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
			return -1;
		else
			return ++subind;
	}
	
	public void insertar(int elem){		
		ultimo = siguiente(ultimo);
		elementos[ultimo]=elem;		
	}
	
	public int borrar(){
		frente = siguiente(frente);
		return elementos[frente];
	}

	public String mostrar(){
        String mostrar = Arrays.toString(elementos);
        return mostrar;
    }

    //método para eliminar elementos repetido:

    public void eliminarRepetidos(){
        int j, top = 0;
        boolean repetido;

        for (int i = 0; i < elementos.length; i++){
            j=0;
            repetido = false;
            while (!repetido && (j < top)){
                if (elementos[i] == colaRep[j]){
                    repetido = true;
                }
                j++;
            }
            if (!repetido){
                colaRep[top++] = elementos[i];
            }
        }
    }

    public boolean estaRepetido(){
        int i, j;
        for (i = 0; i < elementos.length; i++){
            for (j = 0; j<elementos.length; j++){
                if (elementos[i] == colaRep[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    //método para mostrar los elementos sin los repetidos:

    public String mostrarSinRepetir(){
        String mostrarSinRep = Arrays.toString(colaRep);
        return mostrarSinRep;
    }

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        colaRepetida cola = new colaRepetida();

        int opcion;
        int numero;

        boolean continuar = true;

        while (continuar){
            System.out.println("\n----MENU COLA----");
            System.out.println("\n¿Qué quiere hacer? Elija una opción (1, 2 ó 3)");
            System.out.println("\n1- Meter un elemento.");
            System.out.println("\n2- Borrar elemento.");
            System.out.println("\n3- Eliminar elementos repetidos.");
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
                            System.out.println("Elementos actuales en la cola: " + cola.mostrar());
                        }
                        break;
                    }
                    case 2:{
                        if (!cola.estaVacia()){
                            System.out.println("\nSe borró el elemento: "+ cola.borrar());
                            System.out.println("Elementos actuales en la cola: " + cola.mostrar());
                        }else{
                            System.out.println("\nCola vacía, no puede borrar elementos.");
                        }
                        break;
                    }
                    case 3:{
                        if(!cola.estaVacia() && cola.estaRepetido()){
                            cola.eliminarRepetidos();
                            System.out.println("\nElementos repetidos eliminados.");
                            System.out.println("Elementos originales: " + cola.mostrar());
                            System.out.println("\nElementos sin repetir:" + cola.mostrarSinRepetir());
                        }else{
                            System.out.println("\nCola vacía, o no hay elementos repetidos que eliminar.");
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
