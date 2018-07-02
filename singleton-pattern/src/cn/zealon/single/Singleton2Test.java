package cn.zealon.single;

/**
 * @auther: Zealon
 * @Date: 2018-07-02 11:23
 */
public class Singleton2Test {
    //测试
    public static void main(String[] args){
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();

        System.out.println(singleton1==singleton2);
    }
}
