package ld.study.interpreter;
//解释器模式：抽象出来的解释器模式
public interface Expression {

    public int interpret(Context context);
}
