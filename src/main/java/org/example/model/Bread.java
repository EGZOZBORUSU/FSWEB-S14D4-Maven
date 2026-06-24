package org.example.model;

public class Bread extends ProductForSale {
    private String flourType;

    // Testin beklediği 3 parametreli constructor
    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.flourType = "White";
    }

    // Genel kullanım için 4 parametreli constructor
    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    public String getFlourType() { 
        return flourType; 
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Flour: " + flourType);
    }
}