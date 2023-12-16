package ch.luzern.wang.decorator;

/**
 * This is one of the concrete Decorator class
 */
public class MyMonthIncomeAfterTax extends MyMonthIncomeAfterFixedFee  {
    public static final double MY_TAX_RATE = 0.2;

    public MyMonthIncomeAfterTax(MonthIncome monthIncome) {
        super(monthIncome);
    }

    @Override
    public double subtract() {
        return super.subtract() + getGrossIncome()* MY_TAX_RATE;
    }
}