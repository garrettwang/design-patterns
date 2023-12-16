package ch.luzern.wang.decorator;

/**
 * This Class MyMonthIncome act as Core Object
 */
public class MyMonthIncome implements MonthIncome{

    public static final double MONTH_INCOME = 5900.00;

    @Override
    public double getNetIncome() {
        return MONTH_INCOME;
    }

    @Override
    public double subtract() {
        return 0;
    }

    public double getGrossIncome() {
        return MONTH_INCOME;
    }
}