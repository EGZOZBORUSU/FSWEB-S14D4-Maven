package org.example.model;

public class Coke extends ProductForSale {
    private double volume;

    // Testin beklediği 3 parametreli constructor
    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volume = 0.33;
    }

    // Genel kullanım için 4 parametreli constructor
    public Coke(String type, double price, String description, double volume) {
        super(type, price, description);
        this.volume = volume;
    }

    public double getVolume() { 
        return volume; 
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Volume: " + volume);
    }
}