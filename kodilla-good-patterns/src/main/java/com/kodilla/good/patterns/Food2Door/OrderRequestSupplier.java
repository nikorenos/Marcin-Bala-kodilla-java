package com.kodilla.good.patterns.Food2Door;


import com.kodilla.good.patterns.Food2Door.vendors.ExtraFoodShop;
import com.kodilla.good.patterns.Food2Door.vendors.HealthyShop;

public class OrderRequestSupplier {

    public OrderRequest orderRequest() {
        ExtraFoodShop vendor1 = new ExtraFoodShop("ExtraFoodShop", "Brzeziny 8");
        HealthyShop vendor2 = new HealthyShop("HealthyShop", "Dołki 40");

        VendorsList vendorsList = new VendorsList("Basic List");
        vendorsList.addVendor(vendor1);
        vendorsList.addVendor(vendor2);

        Client client = new Client ("Andy", "Smith", "Kaczy Dziób 5");
        Order order = new Order(vendorsList.getVendorsList().get(1), "Blue Cheddar", 20.0, 3);

        return new OrderRequest(client, order);
    }
}
