package Decorator3;

public class PepperoniDecorator extends PizzaDough {


    Pizza pizza;

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    public double price() {
        return pizza.price() + 2;
    }

}
