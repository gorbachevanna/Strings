import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStatsService {
    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void sholdMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }
        @Test
    void shouldLess() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lessAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldMore() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.moreAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
