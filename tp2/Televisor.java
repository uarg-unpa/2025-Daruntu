package tp2;

//implementar la clase Televisor. Con el constructor,
//los set y get que sean necesarios, y con los métodos para encender, apagar, subir y bajar el canal, 
//subir y bajar el volumen, y volver al canal antes seleccionado.

public class Televisor {
    private boolean encendido;
    private int canalActual;
    private int volumen;
    private int canalAnterior;

    public Televisor (int canalActual, int volumen) {
        this.encendido = false;
        this.canalActual = canalActual;
        this.volumen = volumen;
    }

    public void encenderTele(){
        if (this.encendido == false){
            System.out.println("Hola de nuevo.");
            this.encendido = true;
        }
    }

    public void apagarTele() {
        if (this.encendido == true){
            this.encendido = false;
        }
    }

    public void subirCanal() {
        if ( this.canalActual < 25){
            canalAnterior = this.canalActual;
            this.canalActual++;
            System.out.println("Canal: " + this.canalActual);
        }
    }

    public void bajarCanal() {
        if (this.canalActual > 1){
            canalAnterior = this.canalActual;
            this.canalActual--;
            System.out.println("Canal: " + this.canalActual);
        }
    }

    public void subirVolumen() {
        if (this.volumen < 100){
            this.volumen++;
            System.out.println("Volumen: " + this.volumen);
        }
    }

    public void bajarVolumen() {
        if (this.volumen > 0) {
            this.volumen--;
            System.out.println("Volumen: " + this.volumen);
        }
    }

    public void volverCanal(){
        int temp;
        temp = canalActual;
        this.canalActual = canalAnterior;
        canalAnterior = temp;
    }

    public String toString(){
        String estadoTV = "-----------------------\n" +
                         "CANAL ACTUAL: " + this.canalActual + "\n" +
                         "CANAL ANTERIOR: " + canalAnterior + "\n" +
                         "VOLUMEN: " + this.volumen + "\n" +
                         "-----------------------\n";
        return estadoTV;
    }
   
    public void setCanal(int nuevoCanal){
        if (nuevoCanal > 0){
            this.canalAnterior = this.canalActual;
            this.canalActual = nuevoCanal;
            System.out.println("Canal: " + this.canalActual);
        }
    }

    public int getCanalActual() {
        return canalActual;
    }

    public int getCanalAnterior() {
        return canalAnterior;
    }

    public int getVolumen() {
        return volumen;
    }
}
