package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.models.Product;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    void should_never_let_quality_be_greater_than_50_or_less_than_0_after_several_days_passed() {
        Product actual = new Product(10, 10);

        for (int i = 0; i < 100; ++i) {
            actual.passOnyDay();
        }

        assert actual.getQuality() <= 50;
        assert actual.getQuality() >= 0;
    }

    @Test
    void should_decline_half_of_quality_a_day_if_it_is_out_of_sell_in_days() {
        Product actual = new Product(0, 10);

        actual.passOnyDay();
        assert actual.getSellIn() == -1;
        assert actual.getQuality() == 5;

        actual.passOnyDay();
        assert actual.getSellIn() == -2;
        assert actual.getQuality() == 2;

        actual.passOnyDay();
        assert actual.getSellIn() == -3;
        assert actual.getQuality() == 1;

        actual.passOnyDay();
        assert actual.getSellIn() == -4;
        assert actual.getQuality() == 0;
    }
}
