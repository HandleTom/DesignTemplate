package ld.study.singleton;

//单列模式(安全考虑)
//其实说它完美，也不一定，如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。所以说，十分完美的东西是没有的，我们只能根据实际情况，选择最适合自己应用场景的实现方法。
//也有人这样实现：因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字，也是可以的：
public class ThreadSingleton2 {

    private static ThreadSingleton2 instance = null;

    private ThreadSingleton2() {
    }

    private static synchronized void syncInit(){
        if(instance == null){
            instance =  new ThreadSingleton2();
        }
    }

   public static ThreadSingleton2 getInstance(){
        if(instance == null){
            syncInit();
        }
        return instance;
   }

    public Object readResolve() {
        return instance;
    }

    public static void main(String[] args) {
        ThreadSingleton2 singleton = ThreadSingleton2.getInstance();
        if(singleton instanceof ThreadSingleton2){
            System.out.println("you are get threadSingleton2!!!");
        }
    }
}
