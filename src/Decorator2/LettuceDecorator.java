package Decorator2;

public class LettuceDecorator implements Burger {

    protected Burger burger;

    public LettuceDecorator(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", lettuce";
    }

    public double cost() {
        return burger.cost() + 0.25;
    }
}