//Ejercicio que pide el pdf de la teoría de Pilas! 
//"Implementar en Java la clase Pila de
//elementos enteros, probar sus
//operaciones básicas."

package Pilas;

public class Pila {
    private final int maxPila = 5; //no se especifica cual es el tamaño de la pila.
    private int [] elementos;
    private int cima;
    
    public Pila(){
        elementos = new int [maxPila];
        cima = -1;
    }

    public boolean estaVacia(){
        return (cima == -1);
    }

    public void meter(int elem){
        cima++;
        elementos [cima] = elem;
    }

    public boolean estaLlena(){
        return (cima == maxPila - 1);
    }

    public int sacar(){
        int aux = elementos [cima];
        cima--;
        return aux;
    }
}
