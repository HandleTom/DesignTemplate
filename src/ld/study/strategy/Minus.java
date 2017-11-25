package ld.study.strategy;
//minus 减法
public class Minus extends AbstractICalcutor implements ICalculator {

    //exp :2+8
    @Override
    public int calculate(String exp) {
        int[] number = spilt(exp,"-");
        return number[0]-number[1];
    }
}
