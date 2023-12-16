package ch.luzern.wang.decorator;

/**
 * This class is not a part of Decorator Pattern, it is just a client for using the Decorator Pattern code.
 */
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

    public double getNetIncomeAfterSocialInsuranceAndTax() {
        return new MyMonthIncomeAfterTax(new MyMonthIncomeAfterSocialInsurance(myMonthIncome)).getNetIncome();
    }

    public double getNetIncomeAfterSocialInsuranceAndTaxAndUnemploymentInsurance() {
        return new MyMonthIncomeAfterUnemploymentInsurance(new MyMonthIncomeAfterTax(new MyMonthIncomeAfterSocialInsurance(myMonthIncome))).getNetIncome();
    }

    public double getNetIncomeAfterTaxAndUnemploymentInsuranceAndSocialInsurance() {
        return new MyMonthIncomeAfterSocialInsurance(new MyMonthIncomeAfterUnemploymentInsurance(new MyMonthIncomeAfterTax(myMonthIncome))).getNetIncome();
    }
}