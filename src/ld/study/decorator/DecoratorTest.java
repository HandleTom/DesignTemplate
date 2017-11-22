package ld.study.decorator;
//Source类是被装饰类，Decorator类是一个装饰类，可以为Source类动态的添加一些功能.
//装饰器模式的应用场景：
//        1、需要扩展一个类的功能。
//        2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
//        缺点：产生过多相似的对象，不易排错！
public class DecoratorTest {

    public static void main(String[] args) {
        Source source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.method();
    }
}
