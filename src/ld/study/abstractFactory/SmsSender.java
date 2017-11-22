package ld.study.abstractFactory;

public class SmsSender  implements Sender {

    @Override
    public void send() {
        System.out.println("SmsSender Sender...");
    }
}
