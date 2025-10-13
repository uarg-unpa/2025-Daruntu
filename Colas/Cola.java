/*Escriba la clase Cola cuya declaración de atributos y métodos correspondan a la implementación
Frente Fijo y Final Movible (tener en cuenta que al borrar debe correr todos los elementos).*/

package Colas;
public class Cola{
    private int [] elementos;
    private int maxcola;
    private int frente, ultimo;

    public Cola(int maxcola){
        this.maxcola = maxcola;
        elementos = new int [maxcola];
        frente = 0;
        ultimo = 0;
    }

    public boolean estaVacia(){
        return frente == -1;
    }

    public boolean estaLlena(){
        return ultimo == maxcola -1;
    }
    
    public void insertar(int valor){
        elementos[++frente] = valor;
    }

    public int borrar(){
        if (!estaVacia()){
            int eliminado = elementos[0];
            for (int i = 0; i < maxcola; i++){
                elementos[i] = elementos[i + 1];
            }
            frente--;
            return eliminado;
        }
        return 0;
    }

    public int frente(){
        if (estaVacia()){
            return 0;
        }else{
            return elementos[frente];
        }
    }
}
