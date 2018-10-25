package cn.zealon;

/**
 * @Author: zealon
 * @Version: 1.0
 */
public abstract class Pizza {
    protected String pizzaName;
    protected int pizzaPrice;

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaName() {
        return this.pizzaName;
    }

    public int getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
}
