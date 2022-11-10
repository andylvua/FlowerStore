package ua.edu.ucu.apps.flowerstoreweb.models;

public class Rose extends Flower {
    public Rose() {
        super(FlowerType.ROSE);
    }

    public Rose(final double price, final double sepalLength, final FlowerColor color) {
        super(FlowerType.ROSE, price, sepalLength, color);
    }
}
