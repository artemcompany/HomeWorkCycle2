package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {

    }

    //Сумма всех продаж за месяц
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    //Расчет максимального пика продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
                month = month + 1;
            }
        }
        return maxMonth + 1;
    }


    //Расчет минимального пика продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // Средняя сумма продаж в месяц
    public int calcMid(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    // Количество месяцев продажи в которых были ниже среднего
    public int monthsAmountWithSalesLowerAverage(int[] sales) {
        int monthsAmount = 0;
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
            if (monthSale < calcMid(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }

    //Количество месяцев продажи в которых были выше среднего
    public int monthsAmountWithSalesHigherAverage(int[] sales) {
        int monthsAmount = 0;
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
            if (monthSale > calcMid(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;

    }


}


