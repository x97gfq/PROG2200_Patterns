package Decorator3;

public class CheeseDecorator extends PizzaDough {

    Pizza pizza;

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double price() {
        return pizza.price() + 3;
    }

}
