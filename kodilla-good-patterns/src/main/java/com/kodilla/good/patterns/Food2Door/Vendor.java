package com.kodilla.good.patterns.Food2Door;

public abstract class Vendor {
    private String name;
    private String address;

    public Vendor(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract public void process();

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
