package ld.study.simpleFactory;

public class SmsSender  implements Sender {

    @Override
    public void send() {
        System.out.println("SmsSender Sender...");
    }
}
