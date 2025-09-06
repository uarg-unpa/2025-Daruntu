//Una simulación espacial registra naves con nombre, velocidad máxima (km/h),
//combustible restante (litros), y destino.
//Los jugadores quieren verificar si una nave puede llegar a su destino (combustible > 1000),
//acelerar (aumentar velocidad) y mostrar un informe de la misión.

public class Sim_Nave {
    private String nombre;
    private double velocidad;
    private double litros;
    private String destino;
    private final double consumo_litros = 150;

    public Sim_Nave (String nombre, double velocidad, double litros, String destino){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.litros = litros;
        this.destino = destino;
    }

    public boolean puedeLlegar(){
        return litros > 1000;
    }

    public void acelerar(){
        if (litros >= consumo_litros) {
            this.velocidad += 100;
            this.litros -= consumo_litros;
            System.out.println("La nave " +this.nombre+ " aceleró a "+this.velocidad+ " km/h");
            System.out.println("Combustible consumido: " + consumo_litros + " litros.");
        } else {
            System.out.println("¡CUIDADO! No hay suficiente combustible para acelerar."); 
        }
    }

    public void mostrarInforme() {
        System.out.println("-----------------------");
        System.out.println("Nombre de la nave: " + this.nombre);
        System.out.println("Destino: " + this.destino);
        System.out.println("Velocidad: " + this.velocidad + " km/h");
        System.out.println("Combustible restante: " + this.litros + " litros");
        System.out.println("-----------------------");

        if (this.puedeLlegar()) {
            System.out.println("Estado: La nave tiene suficiente combustible para llegar a su destino");
        }   else {
            System.out.println("Estado: ¡ALERTA! El combustible es insuficiente para la misión.");
            }
    }

    public String getNombre() {
        return nombre;
    }
    
    public double getVelocidad() {
        return velocidad;
    }

    public double getLitros() {
        return litros;
    }

    public String getDetino() {
        return destino;
    }
}    