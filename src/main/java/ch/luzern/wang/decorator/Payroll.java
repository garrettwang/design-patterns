package ch.luzern.wang.decorator;

public class Payroll {

    private final MyMonthIncome myMonthIncome;

    public Payroll(MyMonthIncome myMonthIncome) {
        this.myMonthIncome = myMonthIncome;
    }

    public double getGrossIncome() {
        return myMonthIncome.getGrossIncome();
    }

    public double getNetIncomeAfterTax() {
        return new MyMonthIncomeAfterTax(myMonthIncome).getNetIncome();
    }

    public double getNetIncomeAfterSocialInsurance() {
        return new MyMonthIncomeAfterSocialInsurance(myMonthIncome).getNetIncome();
    }
}