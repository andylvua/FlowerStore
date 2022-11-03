package ua.edu.ucu.apps.flowerstoreweb.delivery;

import ua.edu.ucu.apps.flowerstoreweb.models.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}