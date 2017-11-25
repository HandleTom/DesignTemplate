package ld.study.strategy;

public abstract class AbstractICalcutor {

    //exp :2+8   opt:+
    public int[] spilt(String exp,String opt){
        String array[] = exp.split(opt);
        int[] number = new int[2];
        number[0] = Integer.parseInt(array[0]);
        number[1] = Integer.parseInt(array[1]);
        return number;

    }
}
