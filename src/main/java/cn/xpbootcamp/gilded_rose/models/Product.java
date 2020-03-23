package cn.xpbootcamp.gilded_rose.models;

public class Product {
    int sellIn;
    int quality;

    public Product(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void passOnyDay() {
        sellIn -= 1;
        quality /= 2;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}