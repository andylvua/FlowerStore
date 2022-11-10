import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstoreweb.models.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);
    }

    @Test
    void testPrice() {
        assertEquals(100, flowerBucket.getPrice());
    }

    @Test
    void testToString() {
        assertEquals("FlowerBucket{flowerPacks=[Flower pack: Flower: ROSE, price: 10.0," +
                " sepal length: 0.0, color: null, count: 10], price=100.0, flowerCount=10}",
                flowerBucket.toString());
    }

    @Test
    void testAddFlowerPack() {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket.addFlowerPack(flowerPack);
        assertEquals(200, flowerBucket.getPrice());
    }

    @Test
    void testGetFlowerPacks() {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket.addFlowerPack(flowerPack);
        assertEquals(2, flowerBucket.getFlowerPacks().size());
    }

    @Test
    void testGetPrice() {
        assertEquals(100, flowerBucket.getPrice());
    }

    @Test
    void testGetFlowerCount() {
        assertEquals(10, flowerBucket.getFlowerCount());
    }

    @Test
    void testConstructor() {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        ArrayList<FlowerPack> flowerPacks = new ArrayList<>();
        flowerPacks.add(flowerPack);
        FlowerBucket flowerBucket = new FlowerBucket(flowerPacks);
        assertEquals(100, flowerBucket.getPrice());
    }
}
