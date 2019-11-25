package com.teachmeskill.homework.hometask9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Shop {

    private ArrayList<Product> productsList = new ArrayList<>();

    public Shop() {
    }

    public Shop(ArrayList<Product> productsList) {
        this.productsList = productsList;
    }

    public void setProductsList(ArrayList<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return productsList.equals(shop.productsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsList);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "productsList=" + productsList +
                '}';
    }

    public void addProduct(Product addedProduct) {
        int flag = 0;

        if (productsList.isEmpty()) {
            productsList.add(addedProduct);
        } else {
            for (Product product : productsList) {
                if (addedProduct.getId() == product.getId()) {
                    System.out.println("Продукт с id " + product.getId() + " уже существует.");
                    flag = 1;
                }
            }
            if (flag == 0) {
                productsList.add(addedProduct);
            }
        }
    }

    public ArrayList getProductsList() {
        if (productsList.isEmpty()) {
            System.out.println("В магазине нет товаров.");
        } else {
            System.out.println("Товары магазина:");
        }
        return productsList;
    }

    public void removeProduct(int id) {
        int index = -1;

        if (productsList.isEmpty()) {
            System.out.println("В магазине нет товаров, удаление невозможно.");
        } else {
            for (Product product : productsList) {
                if (id == product.getId()) {
                    index = productsList.indexOf(product);
                }
            }
            if (index == -1) {
                System.out.println("Товар с введенным id не найдет, удаление невозможно.");
            } else {
                productsList.remove(index);
                System.out.println("Товар с введенным id успешно удален.");
            }
        }
    }

    public void editProduct(Product product) {
        int flag = 0;

        if (productsList.isEmpty()) {
            System.out.println("Магазин пуст, нечего редактировать.");
        } else {
            for (Product editedProduct : productsList) {
                if (product.getId() == editedProduct.getId()) {
                    editedProduct.setName(product.getName());
                    editedProduct.setPrice(product.getPrice());
                    System.out.println("Товар успешно отредактирован.");
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("Товара с таким id нет в магазине, редактирование невозможно. Вы можете добавить данный товар в магазин.");
            }
        }
    }

    public ArrayList sortByPrice(ArrayList productsList){
        productsList.sort(Comparator.comparing(Product::getPrice));
        return productsList;
    }
}
