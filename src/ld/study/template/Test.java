package ld.study.template;

//解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用，先看个关系图：
//就是在AbstractCalculator类中定义一个主方法calculate，calculate()调用spilt()等，Plus和Minus分别继承AbstractCalculator类，通过对AbstractCalculator的调用实现对子类的调用，看下面的例子：
public class Test {

    public static void main(String[] args) {
        String exp = "2+8";
        AbstractCalculator plus = new Plus();
        int result = plus.calculator(exp,"\\+");
        System.out.println("result:"+exp+"="+result);

         exp = "2-8";
        AbstractCalculator minus = new Minus();
        result = minus.calculator(exp,"-");
        System.out.println("result:"+exp+"="+result);
    }
}
