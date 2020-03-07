package com.example.hackathon.Modelos;

class Etapa {

    private int temperaturaMaxima;
    private int temperaturaMinima;
    private String diasDuracion;
    private String humedad;
    private Fertilizante fertilizante;
    private String ph;

    public Etapa() {
    }

    public Etapa(int temperaturaMaxima, int temperaturaMinima, String diasDuracion, String humedad) {
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.diasDuracion = diasDuracion;
        this.humedad = humedad;
    }

    public Etapa(int temperaturaMaxima, int temperaturaMinima, String diasDuracion, String humedad, Fertilizante fertilizante, String ph) {
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.diasDuracion = diasDuracion;
        this.humedad = humedad;
        this.fertilizante = fertilizante;
        this.ph = ph;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public String getDiasDuracion() {
        return diasDuracion;
    }

    public void setDiasDuracion(String diasDuracion) {
        this.diasDuracion = diasDuracion;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public Fertilizante getFertilizante() {
        return fertilizante;
    }

    public void setFertilizante(Fertilizante fertilizante) {
        this.fertilizante = fertilizante;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }
}
