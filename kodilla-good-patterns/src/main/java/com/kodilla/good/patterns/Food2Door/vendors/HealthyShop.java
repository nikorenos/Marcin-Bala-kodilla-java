package com.kodilla.good.patterns.Food2Door.vendors;

import com.kodilla.good.patterns.Food2Door.Vendor;

public class HealthyShop extends Vendor {
    public HealthyShop(String name, String address) {
        super(name, address);
    }

    @Override
    public void process() {
        System.out.println("Order process specific for " + getName());
    }
}
