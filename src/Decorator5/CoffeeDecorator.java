
public abstract class CoffeeDecorator implements Beverage {
    protected final Beverage beverage;

    protected CoffeeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
