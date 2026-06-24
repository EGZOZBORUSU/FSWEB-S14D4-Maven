package org.example.model;

public class Chocolate extends ProductForSale {
    private String flavor;

    // Testin beklediği 3 parametreli constructor
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.flavor = "Default";
    }

    // Genel kullanım için 4 parametreli constructor
    public Chocolate(String type, double price, String description, String flavor) {
        super(type, price, description);
        this.flavor = flavor;
    }

    public String getFlavor() { 
        return flavor; 
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Flavor: " + flavor);
    }
}