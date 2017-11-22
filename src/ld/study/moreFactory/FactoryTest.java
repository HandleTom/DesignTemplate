package ld.study.moreFactory;

//多个工厂方法模式
public class FactoryTest {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }



    public static void main(String[] args) {
        FactoryTest factory = new FactoryTest();
        Sender  sender = factory.produceSms();
        sender.send();
    }
}
