package Decorator3;

public class PizzaDough implements Pizza {

    Pizza pizza;

    public PizzaDough() {

    }

    public PizzaDough(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double price() {
        return 4;
    }
}
