package ru.mirea.practice.ex3;

import java.util.ArrayList;
import java.util.List;

public class User {
    String login;
    int password;
    private final List<Goods> cart = new ArrayList<Goods>();

    User(String login, String password) {
        this.login = login;
        this.password = password.hashCode();
    }

    public void addToCart(Goods product) {
        cart.add(product);
    }

    public int getCartSum() {
        int sum = 0;
        for (Goods element: cart) {
            sum += element.getPrice();
        }
        return sum;
    }

    public List<Goods> getCart() {
        return cart;
    }
}
