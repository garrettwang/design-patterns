package ch.luzern.wang.decorator;

public class MyMonthIncome implements MonthIncome{

    public static final double MONTH_INCOME = 5900.00;

    @Override
    public double getNetIncome() {
        return MONTH_INCOME;
    }

    public double getGrossIncome() {
        return MONTH_INCOME;
    }
}