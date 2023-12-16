package ch.luzern.wang.decorator;

/**
 * This is the asbtract Decorator class
 */
public abstract class MyMonthIncomeAfterFixedFee implements MonthIncome{
    private final MonthIncome monthIncome;

    protected MyMonthIncomeAfterFixedFee(MonthIncome monthIncome) {

        this.monthIncome = monthIncome;
    }
@Override
public double getNetIncome() {
    return getGrossIncome() - subtract();
}
    @Override
    public double getGrossIncome() {
        return monthIncome.getGrossIncome();
    }

    @Override
    public double subtract() {
        return monthIncome.subtract();
    }
}