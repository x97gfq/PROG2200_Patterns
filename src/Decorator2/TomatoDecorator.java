package Decorator2;

public class TomatoDecorator implements Burger {

    protected Burger burger;

    public TomatoDecorator(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", lettuce";
    }

    public double cost() {
        return burger.cost() + 0.25;
    }
}