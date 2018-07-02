package cn.zealon.single;

/**
 * 单例模式1（基于静态工厂实现）
 * @auther: Zealon
 * @Date: 2018-07-02 10:55
 */
public class Singleton1 {

    //禁止new Object() 的使用
    private Singleton1(){}

    //volatile 修饰后，可以阻止JVM指令重拍，保证指令顺序执行。
    private volatile static Singleton1 instance = null;

    //静态工厂方法
    public static Singleton1 getInstance(){
        if(instance==null){
            //多线程情况下，增加类级别锁，保证线程安全
            synchronized(Singleton1.class){
                if(instance==null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
