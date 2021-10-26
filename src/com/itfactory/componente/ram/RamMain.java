package com.itfactory.componente.ram;

public class RamMain
{
    public static void main(String[] args)
    {
        Ram ram = new Ram();
        System.out.println(ram.getTipMemorie());
        System.out.println(ram.getUnitateMasura());
        System.out.println(ram.getCapacitateMemorie());

        ram.setCapacitateMemorie(16);
        ram.setTipMemorie("DDR3");
        ram.setUnitateMasura("GB");

        System.out.println("Memorie ram de tip " + ram.getTipMemorie() + " cu capacitate de " + ram.getCapacitateMemorie() + ram.getUnitateMasura());
    }
}
