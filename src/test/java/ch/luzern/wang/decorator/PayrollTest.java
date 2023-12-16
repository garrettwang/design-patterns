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
        double actual = testee.getNetIncome();
        Assertions.assertThat(actual).isEqualTo(5900.00*0.8);
    }
}