package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Engine {
    @Autowired
    Manufacturer manufacturer;

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void model() {
        System.out.println("V8, 24 Horse power");
        System.out.println("Manufacturer: " + manufacturer.name());
    }
}
