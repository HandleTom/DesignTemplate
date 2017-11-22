package ld.study.simpleFactory;

public class MailSender implements Sender {


    @Override
    public void send() {
        System.out.println("MailSender Sender...");
    }

}
