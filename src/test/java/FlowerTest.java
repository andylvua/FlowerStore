import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstoreweb.models.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerTest {
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    void testPrice() {
        int price = 20;
        flower.setPrice(price);
        assertEquals(price, flower.getPrice());
    }

    @Test
    void testColor() {
        FlowerColor price = FlowerColor.RED;
        flower.setColor(price);
        assertEquals("#FF0000", flower.getColor());
    }

    @Test
    void testToString() {
        Flower flower = new Flower(FlowerType.TULIP, 20, 10, FlowerColor.RED);
        assertEquals("Flower: TULIP, price: 20.0, sepal length: 10.0, color: RED", flower.toString());
    }

    @Test
    void testSepalLength() {
        double sepalLength = 20;
        flower.setSepalLength(sepalLength);
        assertEquals(sepalLength, flower.getSepalLength());
    }

    @Test
    void testType() {
        FlowerType type = FlowerType.ROSE;
        flower.setType(type);
        assertEquals(type, flower.getType());
    }

    @Test
    void testConstructor() {
        Flower flower = new Flower(FlowerType.ROSE, 20, 20, FlowerColor.RED);
        assertEquals("Flower: ROSE, price: 20.0, sepal length: 20.0, color: RED", flower.toString());
    }

    @Test
    void testDefaultConstructor() {
        Flower flower = new Flower();
        assertEquals("Flower: null, price: 0.0, sepal length: 0.0, color: null", flower.toString());
    }
}