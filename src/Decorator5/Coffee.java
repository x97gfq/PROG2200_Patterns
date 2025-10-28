
public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double cost() {
        return 2.50; // base price
    }
}
