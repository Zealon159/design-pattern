package cn.zealon.single;

/**
 * @auther: Zealon
 * @Date: 2018-07-02 11:08
 */
public class Singleton1Test {
    //测试
    public static void main(String[] args){
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();

        System.out.println(singleton1==singleton2);
    }
}
