package ld.study.strategy;

public class Plus extends AbstractICalcutor implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] number = spilt(exp,"\\+");
        return number[0]+number[1];

    }
}
