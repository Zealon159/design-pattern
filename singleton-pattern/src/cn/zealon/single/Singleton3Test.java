package cn.zealon.single;


/**
 * @auther: Zealon
 * @Date: 2018-07-02 11:26
 */
public class Singleton3Test {
    public static void main(String[] args){
        Singleton3 singleton1 = Singleton3.INSTANCE;
        Singleton3 singleton2 = Singleton3.INSTANCE;

        System.out.println(singleton1==singleton2);

        singleton1.singleMethod("任意字符串.");
    }
}
