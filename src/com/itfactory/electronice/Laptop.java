package com.itfactory.electronice;

import com.itfactory.componente.ram.Ram;

public class Laptop {
    private String marca;
    private String culoare;
    private double dimensiuneEcran;
    private Ram memorieRam;

    public Laptop() {

    }

    public Laptop(String marca, String culoare, double dimensiuneEcran) {
        this.marca = marca;
        this.culoare = culoare;
        this.dimensiuneEcran = dimensiuneEcran;
    }

    public Ram getRam() {
        return memorieRam;
    }

    public void setMemorieRam(Ram memorieRam) {
        this.memorieRam = memorieRam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getDimensiuneEcran() {
        return dimensiuneEcran;
    }

    public void setDimensiuneEcran(double dimensiuneEcran) {
        this.dimensiuneEcran = dimensiuneEcran;
    }
}
