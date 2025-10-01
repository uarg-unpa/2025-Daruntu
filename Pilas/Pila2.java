//Agregar a la clase Pila el método elementoCima() que retorne el elemento cima sin cambiar la pila. 

package Pilas;
public class Pila2 {
    private final int maxpila = 5;
    private int [] elementos;
    private int cima;

    public Pila2(){
        elementos = new int [maxpila];
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
        return (cima == maxpila -1);
    }

    public int sacar(){
        int aux = elementos [cima];
        cima--;
        return aux;
    }

    public int elementoCima(){
        return (elementos [cima]);
    }
    
}
