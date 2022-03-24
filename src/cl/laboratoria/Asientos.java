package cl.laboratoria;

public class Asientos {
    private String TipoAsiento;
    private int Nasiento;
    private int ValorAsiento;
    private boolean Acolchado;
    private boolean Reservado;
    private float Ancho;

//getter and setter


    public String getTipoAsiento() {
        return TipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        TipoAsiento = tipoAsiento;
    }

    public int getNasiento() {
        return Nasiento;
    }

    public void setNasiento(int nasiento) {
        Nasiento = nasiento;
    }

    public int getValorAsiento() {
        return ValorAsiento;
    }

    public void setValorAsiento(int valorAsiento) {
        ValorAsiento = valorAsiento;
    }

    public boolean isAcolchado() {
        return Acolchado;
    }

    public void setAcolchado(boolean acolchado) {
        Acolchado = acolchado;
    }

    public boolean isReservado() {
        return Reservado;
    }

    public void setReservado(boolean reservado) {
        Reservado = reservado;
    }

    public float getAncho() {
        return Ancho;
    }

    public void setAncho(float ancho) {
        Ancho = ancho;
    }

    //metodo
    public Asientos(String tipoAsiento,int nasiento, int valorAsiento, boolean acolchado, boolean reservado, float ancho) {
        super();
        this.TipoAsiento = tipoAsiento;
        this.Nasiento = nasiento;
        this.ValorAsiento = valorAsiento;
        this.Acolchado = true;
        this.Reservado = false;
        this.Ancho = ancho;
    }


    public String toString() {
        String info = "Asiento: "+getTipoAsiento()+" "+getNasiento();
        info +=" $ "+ this.ValorAsiento + " ";
        if (this.isAcolchado()) {
            info += "Es acolchado";
        }else {
            info += "Sin acolchado";
        }
        info += " el ancho del asiento es de "+ this.Ancho + "cm ";
        if (this.isReservado()) {
            info += " esta reservado";
        }else {
            info += " y esta disponible";
        }
        return info;
    }





}
