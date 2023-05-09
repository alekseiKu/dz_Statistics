
public class StatisticsService {
    public int totalSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int sumBelowAverage = 0;
        int average = averageSales(sales);
        for (int sale : sales) {
            if (sale < average) {
                sumBelowAverage++;
            }
        }
        return sumBelowAverage;
    }

    public int aboveAverage(int[] sales) {
        int sumAboveAverage = 0;
        int average = averageSales(sales);
        for (int sale : sales) {
            if (sale > average) {
                sumAboveAverage++;
            }
        }
        return sumAboveAverage;
    }
}
