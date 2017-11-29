package ld.study.interpreter;

public class Test {

    public static void main(String[] args) {
        Context context = new Context(12,8);
        System.out.println("num1::"+context.getNum1());
        System.out.println("num2::"+context.getNum2());
        Plus plus = new Plus();
        int result = plus.interpret(context);
        System.out.println("plus::"+context.getNum1()+"+"+context.getNum2()+"="+result);
        Minus minus = new Minus();
        result = minus.interpret(context);
        System.out.println("minus::"+context.getNum1()+"-"+context.getNum2()+"="+result);
    }
}
