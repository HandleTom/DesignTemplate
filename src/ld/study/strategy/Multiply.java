package ld.study.strategy;

public class Multiply extends AbstractICalcutor implements ICalculator{

    @Override
    public int calculate(String exp) {
        int[] number = this.spilt(exp,"\\*");
        return number[0]*number[1];
    }
}
