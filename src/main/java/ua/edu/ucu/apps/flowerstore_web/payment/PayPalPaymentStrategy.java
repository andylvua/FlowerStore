package ua.edu.ucu.apps.flowerstore_web.payment;

import ua.edu.ucu.apps.flowerstore_web.models.Item;
import ua.edu.ucu.apps.flowerstore_web.user.User;

import java.util.List;

public class PayPalPaymentStrategy implements Payment {
    private String email;
    private String password;

    public PayPalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(List<Item> items, User user) {
        System.out.println("Paying " + items + " using PayPal");
        user.setBalance(user.getBalance() - items.stream().mapToDouble(Item::getPrice).sum());
    }
}
