package ld.study.simpleFactory;

//简单工厂模式
public class FactoryTest {

    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("您输入的信息不正确！");
            return null;
        }
    }

    public static void main(String[] args) {
        FactoryTest factory = new FactoryTest();
        Sender sender = factory.produce("mail");
        sender.send();
    }
}
