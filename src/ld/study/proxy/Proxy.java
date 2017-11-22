package ld.study.proxy;

public class Proxy implements Sourceable{

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }


    public void before(){
        System.out.println("before Proxy");
    }

    public void after(){
        System.out.println("after Proxy");
    }
}
