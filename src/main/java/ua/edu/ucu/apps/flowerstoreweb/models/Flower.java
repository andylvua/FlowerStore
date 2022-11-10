package ua.edu.ucu.apps.flowerstoreweb.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "flowers")
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;

    private double sepalLength;

    @Enumerated(EnumType.STRING)
    private FlowerColor color;

    @Enumerated(EnumType.STRING)
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
