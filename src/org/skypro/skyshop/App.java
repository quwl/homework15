package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product milk = new Product("Молоко", 90);
        Product meat = new Product("Мясо", 200);
        Product carrot = new Product("Морковь", 40);
        Product eggs = new Product("Яйца", 80);
        Product apples = new Product("Яблоки", 120);
        Product bread = new Product("Хлеб", 60);

        ProductBasket basket = new ProductBasket();

        System.out.println("<Корзина>");

        System.out.println("Добавляем продукты в корзину.");
        basket.addProduct(milk);
        basket.addProduct(eggs);
        System.out.println("Добавлено 2 продукта:");
        basket.printBasketContents();

        System.out.println("Попробуем добавить ещё 4 продукта.");
        basket.addProduct(meat);
        basket.addProduct(apples);
        basket.addProduct(carrot);
        basket.addProduct(bread);
        basket.printBasketContents();

        System.out.println("Общая стоимость корзины: " + basket.getTotalCost());

        System.out.println("Поиск товаров: ");
        String searchProduct1 = "молоко";
        System.out.printf("Есть ли '%s' в корзине? %b%n", searchProduct1, basket.containsProduct(searchProduct1));

        String searchProduct2 = "хлеб";
        System.out.printf("Есть ли '%s' в корзине?, %b%n", searchProduct2, basket.containsProduct(searchProduct2));

        System.out.println("Очиcтим корзину.");
        basket.clearBasket();

        System.out.println("Содержимое корзины:");
        basket.printBasketContents();

        System.out.println("Общая стоимость корзины: " + basket.getTotalCost());

        System.out.println("Поиск в корзине:");
        System.out.printf("Есть ли '%s' в корзине? %b%n", searchProduct1, basket.containsProduct(searchProduct1));
    }
}

