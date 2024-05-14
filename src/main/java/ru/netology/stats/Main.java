
public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sum = service.calculateSumSales (sales);
        System.out.println(sum);
        long average = service.calculateAverage (sales);
        System.out.println(sum/ sales.length);
        int minMonth = service.minSales (sales);
        System.out.println(minMonth);
        int maxMonth = service.maxSales (sales);
        System.out.println(maxMonth);
        int count = service.lessAverageSales (sales);
        System.out.println(count);
        int counter = service.moreAverageSales (sales);
        System.out.println(counter);
}
}