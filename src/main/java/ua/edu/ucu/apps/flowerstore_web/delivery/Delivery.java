package ua.edu.ucu.apps.flowerstore_web.delivery;

import ua.edu.ucu.apps.flowerstore_web.models.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}