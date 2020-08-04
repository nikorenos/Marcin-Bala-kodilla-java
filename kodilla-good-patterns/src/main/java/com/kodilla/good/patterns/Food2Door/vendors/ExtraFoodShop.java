package com.kodilla.good.patterns.Food2Door.vendors;

import com.kodilla.good.patterns.Food2Door.Vendor;

public class ExtraFoodShop extends Vendor {
    public ExtraFoodShop(String name, String address) {
        super(name, address);
    }

    @Override
    public void process() {
        System.out.println("Order process specific for " + getName());
    }
}
