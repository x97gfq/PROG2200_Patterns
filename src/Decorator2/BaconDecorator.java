package Decorator2;

public class BaconDecorator extends BurgerDecorator {

    public BaconDecorator(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + ", bacon";
    }

    public double cost() {
        return burger.cost() + 1.50;
    }
}