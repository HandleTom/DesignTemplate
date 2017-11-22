package ld.study.moreFactory;


public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("SmsSender Sender...");
    }
}
