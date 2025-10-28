
public class Caramel extends CoffeeDecorator {
    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Caramel";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}
