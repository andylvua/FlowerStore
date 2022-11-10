package ua.edu.ucu.apps.flowerstoreweb.models;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowerPacks = new ArrayList<>();

    public FlowerBucket() {
    }

    public FlowerBucket(final ArrayList<FlowerPack> newFlowerPacks) {
        this.flowerPacks = newFlowerPacks;
    }

    public final void addFlowerPack(final FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public final ArrayList<FlowerPack> getFlowerPacks() {
        return flowerPacks;
    }

    public final double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public final int getFlowerCount() {
        int count = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            count += flowerPack.count();
        }
        return count;
    }

    public final int getFlowerCount(final FlowerType flowerType) {
        int count = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            if (flowerPack.getFlowerType() == flowerType) {
                count += flowerPack.count();
            }
        }
        return count;
    }

    public final int getFlowerCount(final FlowerType flowerType, final int minCount, final int maxCount) {
        int count = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            if (flowerPack.getFlowerType() == flowerType
                    && flowerPack.count() >= minCount && flowerPack.count() <= maxCount) {
                count += flowerPack.count();
            }
        }
        return count;
    }

    @Override
    public final String toString() {
        return "FlowerBucket{"
                + "flowerPacks=" + flowerPacks
                + ", price=" + getPrice()
                + ", flowerCount=" + getFlowerCount()
                + '}';
    }
}
