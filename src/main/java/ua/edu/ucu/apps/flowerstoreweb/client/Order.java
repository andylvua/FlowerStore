package ua.edu.ucu.apps.flowerstoreweb.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstoreweb.delivery.Delivery;
import ua.edu.ucu.apps.flowerstoreweb.models.Item;
import ua.edu.ucu.apps.flowerstoreweb.payment.Payment;
import ua.edu.ucu.apps.flowerstoreweb.user.User;

import java.util.List;


@AllArgsConstructor
@Getter @Setter
public class Order {
    private User user;
    private List<Item> items;
    private int quantity;
    private Payment payment;
    private Delivery delivery;

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    public void processOrder() {
        payment.pay(items, user);
        delivery.deliver(items);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
