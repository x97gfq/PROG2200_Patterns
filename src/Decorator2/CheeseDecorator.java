package Decorator2;

public class CheeseDecorator implements Burger {

    protected Burger burger;

    public CheeseDecorator(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", cheese";
    }

    public double cost() {
        return burger.cost() + 0.50;
    }
}