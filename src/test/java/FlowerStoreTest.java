import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore_web.manager.FlowerStore;
import ua.edu.ucu.apps.flowerstore_web.models.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerStoreTest {
    private static FlowerStore flowerStore;

    @BeforeEach
    public void init() {
        flowerStore = new FlowerStore();
        FlowerBucket flowerBucket = new FlowerBucket();
        Flower rose = new Rose(3, 10, FlowerColor.RED);
        Flower tulip = new Tulip(3, 10, FlowerColor.RED);
        Flower chamomile = new Chamomile(3, 10, FlowerColor.RED);
        flowerBucket.addFlowerPack(new FlowerPack(rose, 10));
        flowerBucket.addFlowerPack(new FlowerPack(tulip, 10));
        FlowerBucket flowerBucket2 = new FlowerBucket();
        flowerBucket2.addFlowerPack(new FlowerPack(chamomile, 10));
        flowerStore.addFlowerBucket(flowerBucket);
        flowerStore.addFlowerBucket(flowerBucket2);
    }

    @Test
    void testSearch() {
        ArrayList<FlowerBucket> result = flowerStore.search(FlowerType.ROSE);

        assertEquals(1, result.size());
    }

    @Test
    void testSearchWithCount() {
        ArrayList<FlowerBucket> result = flowerStore.search(FlowerType.CHAMOMILE, 5, 15);

        assertEquals(1, result.size());
    }

    @Test
    void testSell() {
        FlowerBucket toSell = flowerStore.search(FlowerType.ROSE).get(0);

        flowerStore.sell(toSell);

        ArrayList<FlowerBucket> result = flowerStore.search(FlowerType.ROSE);

        assertEquals(0, result.size());
    }
}
