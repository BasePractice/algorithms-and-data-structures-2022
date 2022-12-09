package ru.mirea.practice.Ex3;

import java.util.ArrayList;

public enum Goods {
    SMARTPHONE(ProductType.TECHNIC,15000),
    TV(ProductType.TECHNIC,20000),
    HEADSET(ProductType.TECHNIC,6000),
    EARBUDS(ProductType.TECHNIC,4500),
    TABLET(ProductType.TECHNIC,20000),
    FRIDGE(ProductType.TECHNIC,30000),
    MICROWAVE(ProductType.TECHNIC,8000),

    PANTS(ProductType.CLOTHES,600),
    SKIRT(ProductType.CLOTHES,1200),
    TIE(ProductType.CLOTHES,700),
    TSHIRT(ProductType.CLOTHES,1000),

    APPLE(ProductType.FOOD,50),
    COFFEE(ProductType.FOOD,350),
    SANDWICH(ProductType.FOOD,240),
    BREAD(ProductType.FOOD,50),
    HAM(ProductType.FOOD,300),
    CHEESE(ProductType.FOOD,200),
    PICKLE(ProductType.FOOD,100),
    TOMATO(ProductType.FOOD,80);
    private final int price;
    private final ProductType productType;

    Goods(ProductType productType, int price) {
        this.productType = productType;
        this.price = price;
    }

    public ProductType getProductType() {
        return  this.productType;
    }

    public int getPrice() {
        return this.price;
    }

    public static ArrayList<Goods> getProductsOfType(ProductType targetProductType) {
        ArrayList<Goods> productsArray = new ArrayList<>();
        for (Goods product: Goods.values()) {
            if (product.getProductType().equals(targetProductType)) {
                productsArray.add(product);
            }
        }
        return  productsArray;
    }
}
