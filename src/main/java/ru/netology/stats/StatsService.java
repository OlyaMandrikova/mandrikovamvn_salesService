package ru.netology.stats;


public class StatsService {
    long[] arrSales = new long[12];

    //1 - найти сумму всех продаж
    public long calculateTheTotalSum(long[] arrSales) {
        long sales = arrSales[0] + arrSales[1] + arrSales[2] + arrSales[3] + arrSales[4] + arrSales[5] + arrSales[6] + arrSales[7] + arrSales[8] + arrSales[9] + arrSales[10] + arrSales[11];
        return sales;
    }

    //2 - найти среднюю сумму продаж в месяц;
    public long calculateTheAverageSum(long[] arrSales) {
        long averageSales = (arrSales[0] + arrSales[1] + arrSales[2] + arrSales[3] + arrSales[4] + arrSales[5] + arrSales[6] + arrSales[7] + arrSales[8] + arrSales[9] + arrSales[10] + arrSales[11]) / 12;
        return averageSales;
    }

    //3 - найти номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
    public int findMaxSalesMonth(long[] maxSales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < maxSales.length; i++) {
            if (maxSales[i] >= maxSales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    //4 - найти номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
    public int findMinSalesMonth(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //5 Найти количество месяцев, в которых продажи были ниже среднего (см. п.2);

    public int monthCounterSumLowerAverage(long[] sales) {
        int count = 0; // счётчик месяцев, удовлетворяющих условию
        long averageSales = (sales[0] + sales[1] + sales[2] + sales[3] + sales[4] + sales[5] + sales[6] + sales[7] + sales[8] + sales[9] + sales[10] + sales[11]) / 12;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < averageSales) {
                count++; // увеличиваем счётчик месяцев, удовлетворяющих условию
            } // System.out.println("Количество месяцев, меньше среднего месячного дохода - " + count);
        }
        return count;
    }


    //6 Найти количество месяцев, в которых продажи были выше среднего (см. п.2).
    public int monthCounterSumAboveAverage(long[] sales) {
        int count = 0; // счётчик месяцев, удовлетворяющих условию
        long averageSales = (sales[0] + sales[1] + sales[2] + sales[3] + sales[4] + sales[5] + sales[6] + sales[7] + sales[8] + sales[9] + sales[10] + sales[11]) / 12;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] > averageSales) {
                count++; // увеличиваем счётчик месяцев, удовлетворяющих условию
            } // System.out.println("Количество месяцев, больше среднего месячного дохода - " + count);
        }
        return count;
    }

}