package Decorator2;

public class TomatoDecorator extends BurgerDecorator {

    public TomatoDecorator(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + ", lettuce";
    }

    public double cost() {
        return burger.cost() + 0.25;
    }
}