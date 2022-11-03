package ua.edu.ucu.apps.flowerstoreweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flowerstoreweb.manager.FlowerStore;
import ua.edu.ucu.apps.flowerstoreweb.models.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/flowerstore")
public class FlowerController {
    private final FlowerStore flowerStore;

    public FlowerController(FlowerStore flowerStore) {
        this.flowerStore = flowerStore;
    }

    private Flower randomFlower() {
        FlowerType[] flowerTypes = FlowerType.values();
        FlowerType flowerType = flowerTypes[(int) (Math.random() * flowerTypes.length)];
        FlowerColor[] flowerColors = FlowerColor.values();
        FlowerColor flowerColor = flowerColors[(int) (Math.random() * flowerColors.length)];
        double price = Math.random() * 100;
        double sepalLength = Math.random() * 10;

        return new Flower(flowerType, price, sepalLength, flowerColor);
    }

    private FlowerPack randomFlowerPack() {
        int count = (int) (Math.random() * 10);
        Flower flower = randomFlower();
        return new FlowerPack(flower, count);
    }

    @GetMapping("/initialize")
    public void initialize() {
        for (int i = 0; i < 10; i++) {
            FlowerBucket flowerBucket = new FlowerBucket();
            for (int j = 0; j < 10; j++) {
                flowerBucket.addFlowerPack(randomFlowerPack());
            }
            flowerStore.addFlowerBucket(flowerBucket);
        }
    }

    @GetMapping
    public String index() {
        return "Welcome to the Flower Store! Use /api/flowerstore/all to get all flower buckets. "
                + "<br><br> Use /api/flowerstore/help to get list of available commands."
                + "<br><br> Use /api/flowerstore/initialize to initialize flower store with random data.";
    }

    @GetMapping("/all")
    public final ArrayList<FlowerBucket> getFlowerBuckets() {
        ArrayList<FlowerBucket> flowerBuckets = flowerStore.getFlowerBuckets();

        if (flowerBuckets.size() == 0) {
            initialize();
        }

        return flowerBuckets;
    }

    @GetMapping("/help")
    public String help() {
        return "Use /api/flowerstore/search?flowerType=ROSE to search for flower buckets with "
                + "flower packs of the specified type. <br><br> Use /api/flowerstore/search?flowerType=ROSE&"
                + "minCount=2&maxCount=5 "
                + "to search for flower buckets with flower packs of the specified type and count in "
                + "the specified range. <br><br> ";
    }

    @GetMapping(path = "/search")
    public final ArrayList<FlowerBucket> search(final FlowerType flowerType) {
        return flowerStore.search(flowerType);
    }

    @GetMapping(path = "/search", params = {"flowerType", "minCount", "maxCount"})
    public final ArrayList<FlowerBucket> search(final FlowerType flowerType, final int minCount, final int maxCount) {
        return flowerStore.search(flowerType, minCount, maxCount);
    }
    
    @GetMapping("/**")
    public String badRoute() {
        return "Whoops! Looks like you've entered a bad route. Try /api/flowerstore/all";
    }
}
