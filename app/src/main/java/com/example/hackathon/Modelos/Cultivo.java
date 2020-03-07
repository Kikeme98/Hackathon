package com.example.hackathon.Modelos;

public class Cultivo {

    private String cultivo;
    private String cobertura;
    private String duracionTotal;
    private String imagen;
    private Etapa etapa1;
    private Etapa etapa2;
    private Etapa etapa3;
    private Etapa etapa4;

    public Cultivo() {
    }

    public Cultivo(String cultivo, String cobertura, String duracionTotal, Etapa etapa1, Etapa etapa2, Etapa etapa3, Etapa etapa4, String imagen) {
        this.cultivo = cultivo;
        this.cobertura = cobertura;
        this.duracionTotal = duracionTotal;
        this.etapa1 = etapa1;
        this.etapa2 = etapa2;
        this.etapa3 = etapa3;
        this.etapa4 = etapa4;
        this.imagen = imagen;
    }

    public String getCultivo() {
        return cultivo;
    }

    public void setCultivo(String cultivo) {
        this.cultivo = cultivo;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getDuracionTotal() {
        return duracionTotal;
    }

    public void setDuracionTotal(String duracionTotal) {
        this.duracionTotal = duracionTotal;
    }

    public Etapa getEtapa1() {
        return etapa1;
    }

    public void setEtapa1(Etapa etapa1) {
        this.etapa1 = etapa1;
    }

    public Etapa getEtapa2() {
        return etapa2;
    }

    public void setEtapa2(Etapa etapa2) {
        this.etapa2 = etapa2;
    }

    public Etapa getEtapa3() {
        return etapa3;
    }

    public void setEtapa3(Etapa etapa3) {
        this.etapa3 = etapa3;
    }

    public Etapa getEtapa4() {
        return etapa4;
    }

    public void setEtapa4(Etapa etapa4) {
        this.etapa4 = etapa4;
    }

    public String getImagen() {
        return this.imagen;
    }
}
