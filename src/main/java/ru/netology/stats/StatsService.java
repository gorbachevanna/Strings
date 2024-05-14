public class StatsService {
    public long calculateSumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return (sum);
    }

    public long calculateAverage(long[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int lessAverageSales(long[] sales) {
        int count = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }
    public int moreAverageSales(long[] sales) {
        int counter = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}
