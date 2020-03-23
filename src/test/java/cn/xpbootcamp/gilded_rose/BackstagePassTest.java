package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.models.BackstagePass;
import org.junit.jupiter.api.Test;

public class BackstagePassTest {
    @Test
    void should_increase_1_point_per_day_when_the_sell_in_is_greater_than_10() {
        BackstagePass actual = new BackstagePass(13, 10);

        actual.passOnyDay();
        assert actual.getSellIn() == 12;
        assert actual.getQuality() == 11;

        actual.passOnyDay();
        assert actual.getSellIn() == 11;
        assert actual.getQuality() == 12;

        actual.passOnyDay();
        assert actual.getSellIn() == 10;
        assert actual.getQuality() == 13;
    }

    @Test
    void should_increase_2_points_per_day_when_the_show_will_be_started_within_10_days() {
        BackstagePass actual = new BackstagePass(10, 10);
        int qualityOfLastDay = 10;
        int sellInOfLastDay = 10;

        for (int i = 0; i < 4; ++i) {
            actual.passOnyDay();
            assert actual.getQuality() == qualityOfLastDay + 2;
            assert actual.getSellIn() == sellInOfLastDay - 1;

            qualityOfLastDay = actual.getQuality();
            sellInOfLastDay = actual.getSellIn();
        }
    }

    @Test
    void should_increase_2_points_per_day_when_the_show_will_be_started_within_5_days() {
        BackstagePass actual = new BackstagePass(5, 10);
        int qualityOfLastDay = 10;
        int sellInOfLastDay = 5;

        for (int i = 0; i < 4; ++i) {
            actual.passOnyDay();
            assert actual.getQuality() == qualityOfLastDay + 3;
            assert actual.getSellIn() == sellInOfLastDay - 1;

            qualityOfLastDay = actual.getQuality();
            sellInOfLastDay = actual.getSellIn();
        }
    }

    @Test
    void should_set_the_quality_to_0_when_the_backstage_pass_is_out_of_date() {
        BackstagePass actual = new BackstagePass(0, 10);

        actual.passOnyDay();
        assert actual.getSellIn() == -1;
        assert actual.getQuality() == 0;
    }
}
