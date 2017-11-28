package ld.study.memento;

public class Test {


    public static void main(String[] args) {
        // 创建原始类
        Original original = new Original("egg");

        //备份类，和原始类属性一摸一样
        Memento memento = new Memento(original.getValue());

        //输出原始类
        System.out.println("before::"+original.getValue());
        original.setValue("dogs");

        //输出设置后的类的属性
        System.out.println("after::"+original.getValue());

        //输出恢复后的类
        Storage storage = new Storage(memento);
        Memento memento1 = storage.getMemento();
        System.out.println("restore::"+memento1.getValue());

    }
}
