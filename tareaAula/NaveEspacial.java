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

    public boolean acelerar(){
        if (this.LITROS > 0) {
            this.VELOCIDAD += 100;
            System.out.println("La nave " + this.NOMBRE + " aceleró a " + this.VELOCIDAD + " km/h");
            return true;
        } else {
            System.out.println("¡ALERTA! La nave " + this.NOMBRE + " no tiene combustible para acelerar.");
            return false;
        }
    }

     public String toString() {
        String informe = "-----------------------\n" +
                         "Nombre de la nave: " + this.NOMBRE + "\n" +
                         "Destino: " + this.DESTINO + "\n" +
                         "Velocidad: " + this.VELOCIDAD + " km/h\n" +
                         "Combustible restante: " + this.LITROS + " litros\n" +
                         "-----------------------\n";

        if (this.puedeLlegar()) {
            informe += "Estado: La nave tiene suficiente combustible para llegar a su destino";
        } else {
            informe += "Estado: ¡ALERTA! El combustible es insuficiente para la misión.";
        }
        return informe;
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