package ch.luzern.wang.decorator;

public class MyMonthIncomeAfterTax implements MonthIncome {
    public static final double MY_TAX_RATE = 0.2;
    private final MonthIncome monthIncome;

    public MyMonthIncomeAfterTax(MonthIncome monthIncome) {
        this.monthIncome = monthIncome;
    }

    @Override
    public double getGrossIncome() {
        return monthIncome.getGrossIncome();
    }

    public double getNetIncome() {
        return getGrossIncome()-getGrossIncome()* MY_TAX_RATE;
    }
}