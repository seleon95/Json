package org.cyonce;

public class Domicilio {

    private String calle;
    private int numero;

    public Domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }
public String getCalle() {
        return calle;
    }

    public void setCalle(String nombre) {
        this.calle = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int edad) {
        this.numero = edad;
    }
}
