package ru.mirea.practice.ex3;

import java.util.ArrayList;

public class User {
    String login;
    int password;
    private final ArrayList<Goods> Cart = new ArrayList<>();
    User(String login, String password) {
        this.login = login;
        this.password = password.hashCode();
    }
    public void addToCart(Goods product) {
        Cart.add(product);
    }
    public int getCartSum() {
        int sum = 0;
        for (Goods element: Cart) {
            sum += element.getPrice();
        }
        return sum;
    }
    public ArrayList<Goods> getCart() {
        return Cart;
    }
}
