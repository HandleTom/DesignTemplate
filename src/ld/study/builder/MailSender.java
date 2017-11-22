package ld.study.builder;

public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("MailSender send...");
    }
}
