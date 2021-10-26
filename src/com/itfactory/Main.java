package com.itfactory;

import com.itfactory.electronice.Laptop;
import com.itfactory.servicii.Geometrie;

public class Main {

    public static void main(String[] args) {
        Geometrie geometrie = new Geometrie();
        System.out.println(geometrie.ariaPatratului(4));

        Laptop laptop = new Laptop("Asus", "gri", 15.6);
    }
}
