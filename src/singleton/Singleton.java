package singleton;

public class Singleton {
    private volatile static Singleton uniqueInstance;
    // 急切实例化
    // private static Singleton uniqueInstance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

   /* synchronized避免初始化的时候多个线程的同步安全问题
      但之后的获取实例过程无需同步等待
    public synchronized static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }*/
}
