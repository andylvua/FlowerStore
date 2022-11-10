package ua.edu.ucu.apps.flowerstoreweb.models;

public class Tulip extends Flower {
    public Tulip() {
        super(FlowerType.TULIP);
    }

    public Tulip(final double price, final double sepalLength, final FlowerColor color) {
        super(FlowerType.TULIP, price, sepalLength, color);
    }
}
