package ch.luzern.wang.decorator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PayrollTest {
    @Test
    void grossIncome() {
        Payroll testee = new Payroll(new MyMonthIncome());
        double actual = testee.getGrossIncome();
        Assertions.assertThat(actual).isEqualTo(5900.00);
    }

    @Test
    void netIncomeAfterTax() {
        Payroll testee = new Payroll(new MyMonthIncome());
        double actual = testee.getNetIncomeAfterTax();
        Assertions.assertThat(actual).isEqualTo(5900.00*0.8);
    }

    @Test
    void netIncomeAfterSocialInsurance() {
        Payroll testee = new Payroll(new MyMonthIncome());
        double actual = testee.getNetIncomeAfterSocialInsurance();
        Assertions.assertThat(actual).isEqualTo(5900.00*0.9);
    }

    @Test
    void netIncomeAfterSocialInsuranceAndTax() {
        Payroll testee = new Payroll(new MyMonthIncome());
        double actual = testee.getNetIncomeAfterSocialInsuranceAndTax();
        Assertions.assertThat(actual).isEqualTo(5900.00 - 5900.00*0.2 -5900.00*0.1);
    }
    @Test
    void netIncomeAfterSocialInsuranceAndTaxAndUnemploymentInsurance() {
        Payroll testee = new Payroll(new MyMonthIncome());
        double actual = testee.getNetIncomeAfterSocialInsuranceAndTaxAndUnemploymentInsurance();
        Assertions.assertThat(actual).isEqualTo(5900.00 - 5900.00*0.2 -5900.00*0.1 -5900.00*0.05);
    }
    @Test
    void netIncomeAfterTaxAndUnemploymentInsuranceAndSocialInsurance() {
        Payroll testee = new Payroll(new MyMonthIncome());
        double actual = testee.getNetIncomeAfterTaxAndUnemploymentInsuranceAndSocialInsurance();
        Assertions.assertThat(actual).isEqualTo(5900.00 - 5900.00*0.2 -5900.00*0.1 -5900.00*0.05);
    }
}