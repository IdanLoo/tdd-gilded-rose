package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.models.Sulfuras;
import org.junit.jupiter.api.Test;

public class SulfurasTest {
    @Test
    void should_never_change_the_quality_of_sulfuras() {
        Sulfuras actual = new Sulfuras(10);

        for (int i = 0; i < 100; ++i) {
            actual.passOnyDay();
            assert actual.getSellIn() == Integer.MAX_VALUE;
            assert actual.getQuality() == 10;
        }
    }
}
