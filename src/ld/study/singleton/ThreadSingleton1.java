package ld.study.singleton;

//单列模式(简单)
public class ThreadSingleton1 {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static ThreadSingleton1 instance = null;

    /* 私有构造方法，防止被实例化 */
    private ThreadSingleton1() {
    }

    private static ThreadSingleton1 getInstance(){
        return new ThreadSingleton1();
    }

    public static ThreadSingleton1 produceFactory(){
        return ThreadSingleton1.getInstance();
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致,并不知道什么鬼 */
    public Object readResolve() {
        return instance;
    }

    public static void main(String[] args) {
        ThreadSingleton1 singleton1 = ThreadSingleton1.produceFactory();
        if(singleton1 instanceof ThreadSingleton1){
            System.out.println("you are get threadSingleton1!!!");
        }
    }
}
