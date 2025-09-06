//Una simulación espacial registra naves con NOMBRE, VELOCIDAD máxima (km/h),
//combustible restante (LITROS), y DESTINO.
//Los jugadores quieren verificar si una nave puede llegar a su DESTINO (combustible > 1000),
//acelerar (aumentar VELOCIDAD) y mostrar un informe de la misión.

public class NaveEspacial {
    private String NOMBRE;
    private double VELOCIDAD;
    private double LITROS;
    private String DESTINO;

    public NaveEspacial (String NOMBRE, double VELOCIDAD, double LITROS, String DESTINO){
        this.NOMBRE = NOMBRE;
        this.VELOCIDAD = VELOCIDAD;
        this.LITROS = LITROS;
        this.DESTINO = DESTINO;
    }

    public boolean puedeLlegar(){
        return LITROS > 1000;
    }

    public void acelerar(){
            this.VELOCIDAD += 100;
            System.out.println("La nave " +this.NOMBRE+ " aceleró a "+this.VELOCIDAD+ " km/h");
        
    }

    public void mostrarInforme() {
        System.out.println("-----------------------");
        System.out.println("NOMBRE de la nave: " + this.NOMBRE);
        System.out.println("DESTINO: " + this.DESTINO);
        System.out.println("VELOCIDAD: " + this.VELOCIDAD + " km/h");
        System.out.println("Combustible restante: " + this.LITROS + " litros");
        System.out.println("-----------------------");

        if (this.puedeLlegar()) {
            System.out.println("Estado: La nave tiene suficiente combustible para llegar a su DESTINO");
        }   else {
            System.out.println("Estado: ¡ALERTA! El combustible es insuficiente para la misión.");
            }
    }

    public String getNOMBRE() {
        return NOMBRE;
    }
    
    public double getVELOCIDAD() {
        return VELOCIDAD;
    }

    public double getLITROS() {
        return LITROS;
    }

    public String getDESTINO() {
        return DESTINO;
    }
}    