package com.itfactory.componente.stocare;

public class MemorieSSD
{
    private int capacitateStocare;
    private String unitateMasura;

    public MemorieSSD(int capacitateStocare, String unitateMasura)
    {
        this.capacitateStocare = capacitateStocare;
        this.unitateMasura = unitateMasura;
    }

    public int getCapacitateStocare()
    {
        return capacitateStocare;
    }

    public String getUnitateMasura()
    {
        return unitateMasura;
    }
}
