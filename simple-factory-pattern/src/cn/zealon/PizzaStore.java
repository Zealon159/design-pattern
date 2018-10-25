package cn.zealon;

/**
 * @Author: zealon
 * @Version: 1.0
 */
public class PizzaStore {

    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = pizzaFactory.createPizza(type);
        System.out.println("处理了一个："+pizza.getClass().getName()+" 类型的Pizza~");
        return  pizza;
    }

    public static void main(String[] args){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("hawaii");
    }
}
