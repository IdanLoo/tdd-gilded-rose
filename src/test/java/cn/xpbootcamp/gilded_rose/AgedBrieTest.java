package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.models.AgedBrie;
import org.junit.jupiter.api.Test;

public class AgedBrieTest {
    @Test
    void should_increase_the_quality_of_the_aged_brie_as_time_goes() {
        AgedBrie actual = new AgedBrie(10, 10);

        int qualityOfLastDay = 10;
        int sellInOfLastDay = 10;

        for (int i = 0; i < 100; ++i) {
            actual.passOnyDay();
            assert actual.getQuality() > qualityOfLastDay;
            assert actual.getSellIn() == sellInOfLastDay - 1;

            qualityOfLastDay = actual.getQuality();
            sellInOfLastDay = actual.getSellIn();
        }
    }
}
