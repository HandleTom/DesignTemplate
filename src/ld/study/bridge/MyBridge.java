package ld.study.bridge;

public class MyBridge extends Bridge{

    public void method(){
        getSource().method();
    }
}
