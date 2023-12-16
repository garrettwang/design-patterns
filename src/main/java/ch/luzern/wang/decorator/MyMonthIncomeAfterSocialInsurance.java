package ch.luzern.wang.decorator;

/**
 * This is one of the concrete Decorator class
 */
public class MyMonthIncomeAfterSocialInsurance extends MyMonthIncomeAfterFixedFee{
    public static final double SOCIAL_INSURANCE_RATE = 0.1;

    public MyMonthIncomeAfterSocialInsurance(MonthIncome monthIncome) {
        super(monthIncome);
    }

     @Override
    public double subtract() {
        return super.subtract() + getGrossIncome() * SOCIAL_INSURANCE_RATE;
    }
}