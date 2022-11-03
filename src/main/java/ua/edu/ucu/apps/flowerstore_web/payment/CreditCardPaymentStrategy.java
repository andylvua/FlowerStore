package ua.edu.ucu.apps.flowerstore_web.payment;

import ua.edu.ucu.apps.flowerstore_web.models.Item;
import ua.edu.ucu.apps.flowerstore_web.user.User;

import java.util.List;

public class CreditCardPaymentStrategy implements Payment {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPaymentStrategy(String nm, String ccNum, String cvv, String expiryDate) {
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }

    @Override
    public void pay(List<Item> items, User user) {
        System.out.println("Paying " + items + " using credit card");
        user.setBalance(user.getBalance() - items.stream().mapToDouble(Item::getPrice).sum());
    }
}
