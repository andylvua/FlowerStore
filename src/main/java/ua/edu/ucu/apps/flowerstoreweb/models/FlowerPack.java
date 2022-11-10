package ua.edu.ucu.apps.flowerstoreweb.models;

public record FlowerPack(Flower flower, int count) {
    public FlowerType getFlowerType() {
        return flower.getType();
    }
    public double getPrice() {
        return flower.getPrice() * count;
    }

    public String toString() {
        return "Flower pack: " + flower + ", count: " + count;
    }
}
