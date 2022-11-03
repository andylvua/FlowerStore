package ua.edu.ucu.apps.flowerstore_web.models;

public class Chamomile extends Flower {
    public Chamomile() {
        super(FlowerType.CHAMOMILE);
    }

    public Chamomile(final double price, final double sepalLength, final FlowerColor color) {
        super(FlowerType.CHAMOMILE, price, sepalLength, color);
    }
}
