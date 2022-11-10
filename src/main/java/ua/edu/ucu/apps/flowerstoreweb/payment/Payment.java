package ua.edu.ucu.apps.flowerstoreweb.payment;

import ua.edu.ucu.apps.flowerstoreweb.models.Item;
import ua.edu.ucu.apps.flowerstoreweb.user.User;

import java.util.List;

public interface Payment {
    void pay(List<Item> items, User user);
}
