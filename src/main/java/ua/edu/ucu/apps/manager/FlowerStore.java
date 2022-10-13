package ua.edu.ucu.apps.manager;

import ua.edu.ucu.apps.models.FlowerBucket;
import ua.edu.ucu.apps.models.FlowerPack;
import ua.edu.ucu.apps.models.FlowerType;

import java.util.ArrayList;

public class FlowerStore {
    private final ArrayList<FlowerBucket> flowerBuckets = new ArrayList<>();

    public FlowerStore() {
    }

    public final void addFlowerBucket(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    public final ArrayList<FlowerBucket> search(final FlowerType flowerType) {
        ArrayList<FlowerBucket> result = new ArrayList<>();
        for (FlowerBucket flowerBucket : flowerBuckets) {
            for (FlowerPack flowerPack : flowerBucket.getFlowerPacks()) {
                if (flowerPack.getFlowerType() == flowerType) {
                    result.add(flowerBucket);
                    break;
                }
            }
        }
        return result;
    }

    public ArrayList<FlowerBucket> search(final FlowerType flowerType, final int minCount, final int maxCount) {
        ArrayList<FlowerBucket> result = new ArrayList<>();
        for (FlowerBucket flowerBucket : flowerBuckets) {
            for (FlowerPack flowerPack : flowerBucket.getFlowerPacks()) {
                if (flowerPack.getFlowerType() == flowerType
                        && flowerPack.count() >= minCount && flowerPack.count() <= maxCount) {
                    result.add(flowerBucket);
                    break;
                }
            }
        }
        return result;
    }

    public final void sell(final FlowerBucket flowerBucket) {
        flowerBuckets.remove(flowerBucket);
    }
}
