package cn.zealon;

/**
 * @Author: zealon
 * @Version: 1.0
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String pizzaType){
        Pizza pizza = null;
        if(pizzaType.equals("hawaii")){
            pizza = new HawaiiPizza();
        }else if(pizzaType.equals("xmsy")){
            pizza = new XMSYPizza();
        }else if(pizzaType.equals("italianSausage")){
            pizza = new ItalianSausagePizza();
        }
        return pizza;
    }
}
