package cn.zealon.single;

/**
 * 单利模式（基于内部类实现）
 * <p>
 *     1.从外部无法访问静态内部类LazyHolder，只有当调用Singleton.getInstance方法的时候，才能得到单例对象INSTANCE。
 *
 *     2.INSTANCE对象初始化的时机并不是在单例类Singleton被加载的时候，而是在调用getInstance方法，
 *     使得静态内部类LazyHolder被加载的时候。因此这种实现方式是利用classloader的加载机制来实现懒加载，
 *     并保证构建单例的线程安全。
 * </p>
 * @auther: Zealon
 * @Date: 2018-07-02 11:18
 */
public class Singleton2 {

    //禁止new Object() 的使用
    private Singleton2(){}

    //外部类无法访问静态内部类 LazyHolder，只有调用Singleton2.getInstance()时，才能获取到单例对象
    private static class LazyHolder{
        //内部类中实例化单例对象
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return LazyHolder.INSTANCE;
    }
}
