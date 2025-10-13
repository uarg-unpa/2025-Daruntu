/*Escriba la clase Cola cuya declaración de atributos y métodos correspondan a la implementación
Frente Fijo y Final Movible (tener en cuenta que al borrar debe correr todos los elementos).*/

package Colas;
public class Cola{
    private int [] elementos;
    private int maxcola = 5;
    private int frente, ultimo;

    public Cola(int maxcola){
        elementos = new int [maxcola];
        frente = 0;
        ultimo = -1;
    }

    public boolean estaVacia(){
        return frente == -1;
    }

    public boolean estaLlena(){
        return ultimo == maxcola -1;
    }
    
    public void insertar(int valor){
        elementos[++ultimo] = valor;
    }

    //esta parte se me complicó porque confundí el frente y el ultimo, pero pude resolverlo.
    
    public int borrar(){
        if (!estaVacia()){
            int eliminado = elementos[0];
            for (int i = 0; i < ultimo - 1; i++){
                elementos[i] = elementos[i + 1];
            }
            ultimo--; 
            return eliminado;
        }
        return -1;
    }

    public int frente(){
        if (estaVacia()){
            return -1;
        }else{
            return elementos[frente];
        }
    }
}
