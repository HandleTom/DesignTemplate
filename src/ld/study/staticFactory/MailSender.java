package ld.study.staticFactory;

public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("MailSender Sender...");
    }

}
