package ld.study.staticFactory;

//静态工厂模式
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        Sender sender1 = SendFactory.produceSms();
        sender.send();
        sender1.send();
    }
}
