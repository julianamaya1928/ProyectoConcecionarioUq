package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    protected String marca;
    protected String esNuevo;
    protected String modelo;
    protected String tipoCombustible;
    protected String transmision;

    public Vehiculo(String marca, String esNuevo, String modelo, String tipoCombustible, String transmision) {
        this.marca = marca;
        this.esNuevo = esNuevo;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.transmision = transmision;
    }

    public String getMarca() {
        return marca;
    }

    public String isEsNuevo() {
        return esNuevo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public String getTransmision() {
        return transmision;
    }

    

    @Override
    public String toString() {
        return " marca=" + marca + ", esNuevo=" + esNuevo + ", modelo=" + modelo + ", tipoCombustible="
                + tipoCombustible + ", transmision=" + transmision ;
    }

    public abstract void mostrarDetalles();
}
