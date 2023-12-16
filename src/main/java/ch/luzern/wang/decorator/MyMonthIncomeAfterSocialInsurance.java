package ch.luzern.wang.decorator;

public class MyMonthIncomeAfterSocialInsurance implements MonthIncome{
    public static final double SOCIAL_INSURANCE_RATE = 0.1;
    private final MyMonthIncome myMonthIncome;

    public MyMonthIncomeAfterSocialInsurance(MyMonthIncome myMonthIncome) {
        this.myMonthIncome = myMonthIncome;
    }

    @Override
    public double getGrossIncome() {
        return myMonthIncome.getGrossIncome();
    }

    @Override
    public double getNetIncome() {
        return getGrossIncome() - getGrossIncome() * SOCIAL_INSURANCE_RATE;
    }
}