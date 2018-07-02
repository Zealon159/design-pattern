package cn.zealon.single;

/**
 * 单例模式（基于枚举实现）
 * <p>
 *     使用枚举方式实现，可以防止利用反射强行构建单例对象，
 *     也可以在枚举类对象被反序列化时，保证反序列的返回结果是同一个对象。
 * </p>
 * @auther: Zealon
 * @Date: 2018-07-02 11:25
 */
public enum Singleton3 {
    INSTANCE;
    public void singleMethod(String params){
        System.out.println("执行单例方法，接收参数："+params);
    }
}
