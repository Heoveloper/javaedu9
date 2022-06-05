package com.kh.shopping;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ShoppingBasket {
    private Set<Product> shoppingBasket;

    public ShoppingBasket() {
        this.shoppingBasket = new TreeSet<>();
    }

    public ShoppingBasket(Comparator comparator) {
        this.shoppingBasket = new TreeSet<>(comparator);
    }

    public void put(Product product) {
        this.shoppingBasket.add(product);
    }

    @Override
    public String toString() {
        return "장바구니: " + shoppingBasket;
    }
}
