package com.ItFactory;

import com.ItFactory.componente.CutieDeViteze;
import com.ItFactory.componente.Motor;

public class Reparatie {
    private String marcaProductie;
    private double costReparatie;
    private Motor motor;
    private CutieDeViteze cutieDeViteze;

    public Reparatie(String marcaProductie, double costReparatie, Motor motor, CutieDeViteze cutieDeViteze) {
        this.marcaProductie = marcaProductie;
        this.costReparatie = costReparatie;
        this.motor = motor;
        this.cutieDeViteze = cutieDeViteze;
    }

    public boolean verificareMarcaMotor() {
        return marcaProductie.equals(motor.getMarcaProductie());
    }

    public boolean verificaMarcaCutieDeViteze() {
        return marcaProductie.equals(cutieDeViteze.getMarcaProductie());
    }

    public double calculeazaCostReparatie() {
        if (verificareMarcaMotor() && verificaMarcaCutieDeViteze()) {
            costReparatie += motor.getPretVanzare() + cutieDeViteze.getPretVanzare();
            if (cutieDeViteze.isAutomata()) {
                costReparatie = costReparatie + 2150.75;
            }
            return costReparatie;
        } else {
            System.out.println("Costul de productie nu poate fi stabilit. Componente gresite");
            return 0;
        }
    }
}

