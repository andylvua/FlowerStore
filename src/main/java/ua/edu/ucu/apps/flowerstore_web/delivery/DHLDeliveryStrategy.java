package ua.edu.ucu.apps.flowerstore_web.delivery;

import ua.edu.ucu.apps.flowerstore_web.models.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Delivering items via DHL");
    }
}
