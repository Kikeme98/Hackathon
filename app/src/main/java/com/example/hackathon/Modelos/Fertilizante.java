package com.example.hackathon.Modelos;

class Fertilizante {

    private String cantidad;
    private String tiempo;

    public Fertilizante() {
    }

    public Fertilizante(String cantidad, String tiempo) {
        this.cantidad = cantidad;
        this.tiempo = tiempo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}
