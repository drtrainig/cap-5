package com.ItFactory;

import com.ItFactory.componente.CutieDeViteze;
import com.ItFactory.componente.Motor;


public class Main {

    public static void main(String[] args) {
        Motor motor = new Motor("Volvo", 235, 2300.0);
        CutieDeViteze cutieDeViteze = new CutieDeViteze("Volvo", 800, true);

        Reparatie reparatieVolvo = new Reparatie("Volvo", 1200, motor, cutieDeViteze);
        double cost = reparatieVolvo.calculeazaCostReparatie();
        System.out.println(cost);


//        Reparatie reparatieVolvo = new Reparatie("Volvo", 1200);
//        Motor motor = new Motor("Fiat", 235, 2300.0);
//        CutieDeViteze cutieDeViteze = new CutieDeViteze("Volvo", 800, true);
//
//
//        reparatieVolvo.setMotor(motor);
//        reparatieVolvo.setCutieDeViteze(cutieDeViteze);
//
//        System.out.println("Marca masinii este: " + reparatieVolvo.getMarcaProductie());
//        System.out.println("Marca motorului este: " + reparatieVolvo.getMotor().getMarcaProductie());
//        System.out.println("Marca Cutiei de viteze este: " + reparatieVolvo.getCutieDeViteze().getMarcaProductie());
//
//        if (reparatieVolvo.egalitateMarcaMotor == reparatieVolvo.egalitateMarcaCutieDeViteze) {
//
//            if (cutieDeViteze.isAutomata()) {
//                reparatieVolvo.setCostReparatie(reparatieVolvo.getCostReparatie() + 2150.75);
//                System.out.println("Costul reparatiei este: " + reparatieVolvo.getCostReparatie());
//            } else {
//                System.out.println("Costul reparatiei este: " + reparatieVolvo.getCostReparatie());
//            }
//        } else {
//            System.out.println("Costul de productie nu poate fi stabilit. Componente gresite");
//        }
    }
}










