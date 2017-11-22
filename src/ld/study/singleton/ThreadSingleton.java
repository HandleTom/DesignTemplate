package ld.study.singleton;

//单列模式(简单)
public class ThreadSingleton {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static ThreadSingleton instance = null;

    /* 私有构造方法，防止被实例化 */
    private ThreadSingleton() {
    }


    /*线程安全构造，方法一:对getInstance方法加synchronized关键字 */
    public static synchronized ThreadSingleton getInstance(){
        if(instance == null ){
            instance = new ThreadSingleton();
        }
        return instance;
    }

    /*线程安全构造，方法二:对getInstance方法加synchronized关键字 */
    public static ThreadSingleton getInstance1(){
        if(instance == null ) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new ThreadSingleton();
                }
            }
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致,并不知道什么鬼 */
    public Object readResolve() {
        return instance;
    }

    public static void main(String[] args) {
        ThreadSingleton singleton = ThreadSingleton.getInstance1();
        if(singleton instanceof ThreadSingleton){
            System.out.println("You are get instance!");
        }
    }
}
