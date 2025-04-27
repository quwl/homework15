package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private final Product[] products;
    private int count;

    public ProductBasket() {
        this.products = new Product[5];
        this.count = 0;
    }

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Невозможно добавить продукт: " + product.getName());
        }
    }
    public int getTotalCost() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    public void printBasketContents() {
        if (count == 0) {
            System.out.println("В корзине пусто");
            return;
        }
        for (int i = 0; i < count; i++) {
            Product product = products[i];
            System.out.printf("%s: %d%n", product.getName(), product.getPrice());
        }
        System.out.println("Итого: " + getTotalCost());
    }

    public boolean containsProduct(String productName) {
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }
    public void clearBasket() {
        Arrays.fill(products, null);
        count = 0;
    }
}
