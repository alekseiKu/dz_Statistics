
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    public void totalAmountAllSales() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.totalSales(sales);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesPerMonth() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maximumSalesMonthNumber() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void minimumSalesMonthNumber() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void salesBelowAverage() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumMonth = 5;
        int actualSumMonth = service.belowAverage(sales);

        assertEquals(expectedSumMonth, actualSumMonth);
    }

    @Test
    public void salesAboveAverage() {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumMonth = 5;
        int actualSumMonth = service.aboveAverage(sales);

        assertEquals(expectedSumMonth, actualSumMonth);
    }
}
