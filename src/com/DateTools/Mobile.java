package com.DateTools;

public class Mobile extends Tel {
    private String brand;
    private int size;

    public Mobile(int number, String position, int price, String brand, int size) {
        super(number, position, price);
        this.brand = brand;
        this.size = size;
    }
}
