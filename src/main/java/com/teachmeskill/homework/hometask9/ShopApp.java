package com.teachmeskill.homework.hometask9;

import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product firstProduct = new Product(1, "Computer", 1000);
        Product secondProduct = new Product(2, "Telephone", 300);
        Product thirtyProduct = new Product(3, "Navigator", 450);
        Product fourthProduct = new Product(1, "Notebook", 1200);

        shop.addProduct(firstProduct);
        shop.addProduct(secondProduct);
        shop.addProduct(thirtyProduct);
        shop.addProduct(fourthProduct);
        System.out.println();

        shop.sortByPrice(shop.getProductsList()).forEach(System.out::println);

        shop.removeProduct(2);
        System.out.println();
        shop.getProductsList().forEach(System.out::println);


        shop.editProduct(fourthProduct);
        System.out.println();
        shop.getProductsList().forEach(System.out::println);

    }
}
