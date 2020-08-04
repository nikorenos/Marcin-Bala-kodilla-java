package com.kodilla.good.patterns.Food2Door;

import java.util.LinkedList;
import java.util.List;

public class VendorsList {
    private final List<Vendor> vendorsList = new LinkedList<>();
    private final String vendorsListName;

    public VendorsList(String vendorsListName) {
        this.vendorsListName = vendorsListName;
    }

    public void addVendor(Vendor vendor) {vendorsList.add(vendor);}
    public void removeVendor(Vendor vendor) {vendorsList.remove(vendor);}

    public List<Vendor> getVendorsList() {
        return vendorsList;
    }

    public String getVendorsListName() {
        return vendorsListName;
    }

    @Override
    public String toString() {
        return "VendorsList{" +
                "vendorsListName='" + vendorsListName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VendorsList that = (VendorsList) o;

        return getVendorsListName() != null ? getVendorsListName().equals(that.getVendorsListName()) : that.getVendorsListName() == null;
    }

}
