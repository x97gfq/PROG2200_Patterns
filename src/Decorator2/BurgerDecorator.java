package Decorator2;

public abstract class BurgerDecorator implements Burger {

    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription();
    }

    public double cost() {
        return burger.cost();
    }

}
