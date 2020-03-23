package cn.xpbootcamp.gilded_rose.models;

public class BackstagePass extends Product {
    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void passOnyDay() {
        if (sellIn > 10) {
            quality += 1;
        } else if (sellIn > 5) {
            quality += 2;
        } else if (sellIn > 0) {
            quality += 3;
        } else {
            quality = 0;
        }

        sellIn -= 1;
    }
}
