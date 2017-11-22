package ld.study.abstractFactory;

public class FactoryTest {

    public static void main(String[] args){
        SendMailFactory factory= new SendMailFactory();
        Sender sender = factory.produce();
        sender.send();
    }
}
