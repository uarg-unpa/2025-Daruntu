package tp2;
public class Fecha {
    private int DIA, MES, ANIO;

    public Fecha (int D, int M, int A){
        if (esValido(D, M)) {
            this.DIA = D;
            this.MES = M;
            this.ANIO = A;
        } else {
            this.DIA = 1;
            this.MES = 1;
            this.ANIO = 2013;
        }
    }

    private boolean esValido(int D, int M){
        if ((D > 31 || D < 1) || (M > 12 || M < 1)){
            return false;
        } else {
            return true;
        }
    }

    public void setDia (int D){
        this.DIA = D;
        
    }

    public int getDia (){
        return this.DIA;
    }

    public void setMes (int M){
            this.MES = M;
    }

    public int getMes (){
        return this.MES;
    }

    public void setAnio (int A){
        this.ANIO = A;
    }

    public int getAnio(){
        return this.ANIO;
    }

    public String getNombreMes(){
        switch (this.MES) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return null; // Si no pongo este return, Java me tira error :(
        }
    }

    public void mostrarFecha(){
        if (esValido(this.DIA, this.MES)){
        System.out.println(this.DIA + " de " + getNombreMes() + " de " + this.ANIO);
        }
    }
}