package ua.edu.ucu.apps.flowerstore_web.manager;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flowerstore_web.models.FlowerBucket;
import ua.edu.ucu.apps.flowerstore_web.models.FlowerPack;
import ua.edu.ucu.apps.flowerstore_web.models.FlowerType;

import java.util.ArrayList;

@SpringBootApplication
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

    @GetMapping("/all")
    public final ArrayList<FlowerBucket> getFlowerBuckets() {
        return flowerBuckets;
    }
}
