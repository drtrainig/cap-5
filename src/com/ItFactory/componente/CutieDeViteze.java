package com.ItFactory.componente;

public class CutieDeViteze {
    private String marcaProductie;
    private double pretVanzare;
    private boolean automata;

    public CutieDeViteze(String marcaProductie, double pretVanzare, boolean automata){
        this.marcaProductie = marcaProductie;
        this.pretVanzare = pretVanzare;
        this.automata = automata;
    }

    public void setMarcaProductie(String marcaProductie) {
        this.marcaProductie = marcaProductie;
    }

    public void setPretVanzare(double pretVanzare) {
        this.pretVanzare = pretVanzare;
    }

    public String getMarcaProductie() {
        return marcaProductie;
    }

    public double getPretVanzare() {
        return pretVanzare;
    }

    public void setAutomata(boolean automata) { this.automata = automata; }

    public boolean isAutomata() { return automata; }


}
