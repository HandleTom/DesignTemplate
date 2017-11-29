package ld.study.interpreter;
//解释接口里面的interpret方法的具体实现
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
