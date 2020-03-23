package cn.xpbootcamp.gilded_rose.models;

public class AgedBrie extends Product {
    public AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void passOnyDay() {
        sellIn -= 1;
        quality += 1;
    }
}
