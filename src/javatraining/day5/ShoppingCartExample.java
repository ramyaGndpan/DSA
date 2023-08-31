package javatraining.day5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ShoppingCartExample {
    public static void main(String[] args) {
        Set<String> userCart = new HashSet<>();
        userCart.add("Product A");
        userCart.add("Product B");
        userCart.add("Product A"); // Duplicate
        userCart.add("Product C");

        System.out.println("User's Shopping Cart: " + userCart);
    }
}
