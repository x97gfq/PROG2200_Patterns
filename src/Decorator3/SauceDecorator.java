package Decorator3;

public class SauceDecorator extends PizzaDough {

    Pizza pizza;

    public SauceDecorator(Pizza pizza) {
        super(pizza);
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Sauce";
    }

    public double price() {
        return pizza.price() + 1;
    }
}
