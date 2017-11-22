package ld.study.beanAdapter;

public class Wrapper implements Targetable{

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        this.source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
