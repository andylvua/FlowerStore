package ua.edu.ucu.apps.flowerstoreweb.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
    private double price;
    private double sepalLength;
    private FlowerColor color;

    private FlowerType type;

    public Flower() {

    }

    public Flower(final FlowerType newType) {
        this.type = newType;
    }

    public Flower(final FlowerType newType, final double newPrice, final double newSepalLength,
                  final FlowerColor newColor) {
        this.type = newType;
        this.price = newPrice;
        this.sepalLength = newSepalLength;
        this.color = newColor;
    }

    public final String getColor() {
        return color.getColor();
    }

    public final String toString() {
        return "Flower: " + type + ", price: " + price + ", sepal length: " + sepalLength + ", color: " + color;
    }
}
