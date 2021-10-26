package com.itfactory.electronice;

import com.itfactory.componente.ram.Ram;

public class LaptopMain
{

    public static void main(String[] args)
    {
        Laptop laptop2 = new Laptop();
        laptop2.setCuloare("rosu");
        System.out.println(laptop2.getCuloare());

        laptop2.setDimensiuneEcran(12.3);
        System.out.println(laptop2.getDimensiuneEcran());

        Ram ram = new Ram();
        ram.setUnitateMasura("GB");
        ram.setCapacitateMemorie(1024);
        ram.setTipMemorie("DDR");
        laptop2.setMemorieRam(ram);

        Ram ram1 = laptop2.getRam();
        System.out.println(ram1.getCapacitateMemorie());

    }
}
