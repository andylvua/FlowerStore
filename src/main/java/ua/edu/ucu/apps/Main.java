package ua.edu.ucu.apps;

import ua.edu.ucu.apps.manager.FlowerStore;
import ua.edu.ucu.apps.models.*;

public class Main {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();

        Flower rose = new Flower(FlowerType.ROSE, 5, 10, FlowerColor.RED);
        Flower chamomile = new Flower(FlowerType.CHAMOMILE, 3, 5, FlowerColor.WHITE);
        Flower tulip = new Tulip(4, 6, FlowerColor.YELLOW);

        FlowerPack rosePack = new FlowerPack(rose, 10);
        FlowerPack chamomilePack = new FlowerPack(chamomile, 5);
        FlowerPack tulipPack = new FlowerPack(tulip, 7);

        FlowerBucket flowerBucketOne = new FlowerBucket();

        flowerBucketOne.addFlowerPack(rosePack);
        flowerBucketOne.addFlowerPack(chamomilePack);
        flowerBucketOne.addFlowerPack(tulipPack);

        flowerStore.addFlowerBucket(flowerBucketOne);

        FlowerBucket flowerBucketTwo = new FlowerBucket();

        flowerBucketTwo.addFlowerPack(rosePack);

        flowerStore.addFlowerBucket(flowerBucketTwo);

        flowerStore.search(FlowerType.ROSE).forEach(System.out::println);
        flowerStore.search(FlowerType.CHAMOMILE).forEach(System.out::println);

    }
}
