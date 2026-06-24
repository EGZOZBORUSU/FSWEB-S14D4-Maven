package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Snacks", 15.5, "Dark Chocolate", "Bitter");
        products[1] = new Coke("Beverage", 20.0, "Cold Drink", 1.5);
        products[2] = new Bread("Bakery", 10.0, "Fresh Bread", "Wheat");
        
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}