package ld.study.builder;

import java.util.ArrayList;

//建造者模式（Builder）
/*工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，
其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。我们看一下代码：
还和前面一样，一个Sender接口，两个实现类MailSender和SmsSender。最后，建造者类如下：*/
public class Builder {

    private ArrayList<Sender> senders = new ArrayList<>();

    public ArrayList<Sender> produceMailSenders(int count){
        for (int i = 0 ;i < count; i++){
            senders.add(new MailSender());
        }
        return senders;
    }

    public ArrayList<Sender> produceSmsSenders(int count) {
        for (int i = 0; i < count; i++) {
            senders.add(new SmsSender());
        }
        return senders;
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        ArrayList<Sender> senders = builder.produceMailSenders(10);
        System.out.println("size::"+senders.size());
    }

//    工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。因此，是选择工厂模式还是建造者模式，依实际情况而定。
}
