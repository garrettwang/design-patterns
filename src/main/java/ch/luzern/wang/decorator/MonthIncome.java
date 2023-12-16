package ch.luzern.wang.decorator;

public interface MonthIncome {

    double getGrossIncome();
    double getNetIncome();

    double subtract();

}
