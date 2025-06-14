package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    //1
    @Test
    public void shouldcalculateTheSum() {
        StatsService service = new StatsService();
        long[] arrSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.calculateTheTotalSum(arrSales);
        Assertions.assertEquals(expectedSum, actualSum);
    }


    //2
    @Test
    public void shouldcalculateTheAverageSum() {
        StatsService service = new StatsService();
        long[] arrSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 15;
        long actualSum = service.calculateTheAverageSum(arrSales);
        Assertions.assertEquals(expectedSum, actualSum);
    }


//3

    @Test

    public void shouldFindTheMaxMonth() {
        StatsService service = new StatsService();
        long[] maxSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNum = 8;
        long actualNum = service.findMaxSalesMonth(maxSales);
        Assertions.assertEquals(expectedNum, actualNum);
    }

//4

    @Test

    public void shouldFindTheMinMonth() {
        StatsService service = new StatsService();

        long[] arrSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNum = 9;
        long actualNum = service.findMinSalesMonth(arrSales);
        Assertions.assertEquals(expectedNum, actualNum);
    }


    //5
    @Test
    public void shouldFindTheAmountOfMonthLowerTheAverage() {
        StatsService service = new StatsService();
        long[] arrSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAmount = 5;
        long actualAmount = service.monthCounterSumLowerAverage(arrSales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }


    //6
    @Test
    public void shouldFindTheAmountOfMonthHigherTheAverage() {
        StatsService service = new StatsService();
        long[] arrSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAmount = 5;
        long actualAmount = service.monthCounterSumLowerAverage(arrSales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }


}