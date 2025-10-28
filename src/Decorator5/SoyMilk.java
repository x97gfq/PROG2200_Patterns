
public class SoyMilk extends CoffeeDecorator {
    public SoyMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Soy Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}
