package ch.luzern.wang.decorator;

/**
 * This is one of the concrete Decorator class
 */
public class MyMonthIncomeAfterUnemploymentInsurance extends MyMonthIncomeAfterFixedFee{

    public static final double UNEMPLOYMENT_INSURANCE_RATE = 0.05;

    public MyMonthIncomeAfterUnemploymentInsurance(MonthIncome monthIncome) {
        super(monthIncome);
    }

    @Override
    public double subtract() {
        return super.subtract() + getGrossIncome() * UNEMPLOYMENT_INSURANCE_RATE;
    }
}