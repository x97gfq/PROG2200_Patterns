package Decorator2;

public class BaconDecorator implements Burger {

    protected Burger burger;

    public BaconDecorator(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", bacon";
    }

    public double cost() {
        return burger.cost() + 1.50;
    }
}