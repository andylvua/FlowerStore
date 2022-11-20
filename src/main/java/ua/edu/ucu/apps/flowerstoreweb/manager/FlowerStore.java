package ua.edu.ucu.apps.flowerstoreweb.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import ua.edu.ucu.apps.flowerstoreweb.database.FlowerRepository;
import ua.edu.ucu.apps.flowerstoreweb.models.Flower;
import ua.edu.ucu.apps.flowerstoreweb.models.FlowerBucket;
import ua.edu.ucu.apps.flowerstoreweb.models.FlowerPack;
import ua.edu.ucu.apps.flowerstoreweb.models.FlowerType;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Service
public class FlowerStore {
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerStore(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public FlowerStore() {
    }

    public List<Flower> getFlowersFromDatabase() {
        return flowerRepository.findAll();
    }

    public void addFlowerToDatabase(Flower flower) {
        flowerRepository.save(flower);
    }

    private final ArrayList<FlowerBucket> flowerBuckets = new ArrayList<>();

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
