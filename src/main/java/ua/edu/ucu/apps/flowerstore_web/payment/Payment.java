package ua.edu.ucu.apps.flowerstore_web.payment;

import ua.edu.ucu.apps.flowerstore_web.models.Item;
import ua.edu.ucu.apps.flowerstore_web.user.User;

import java.util.List;

public interface Payment {
    void pay(List<Item> items, User user);
}
