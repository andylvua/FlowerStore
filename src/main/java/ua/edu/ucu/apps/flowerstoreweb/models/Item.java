package ua.edu.ucu.apps.flowerstoreweb.models;

public class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String newName, int newQuantity, double newPrice) {
        this.name = newName;
        this.quantity = newQuantity;
        this.price = newPrice;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
