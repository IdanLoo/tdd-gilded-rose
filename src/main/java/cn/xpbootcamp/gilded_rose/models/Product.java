package cn.xpbootcamp.gilded_rose.models;

public class Product {
    public Product(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void passOnyDay() {
        this.sellIn -= 1;
        this.quality /= 2;
    }

    private int sellIn;
    private int quality;

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}