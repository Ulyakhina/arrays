package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public long medium(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        long saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales[i];
            }
        }
        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int minMonth = 0;
        // long saleMin = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthMediumLess(long[] sales) {
        //long mediumSale = medium(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale < medium(sales)) {
                count++;
            }
        }

        return count;
    }

    public int monthMediumAbove(long[] sales) {
        long mediumSale = medium(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale > mediumSale) {
                count++;
            }
        }

        return count;
    }

}
