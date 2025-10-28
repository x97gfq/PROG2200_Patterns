
public class Chocolate extends CoffeeDecorator {
    public Chocolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Chocolate";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.75;
    }
}
