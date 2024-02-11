package Decorator2;

public class CheeseBurger implements Burger {


    @Override
    public String getDescription() {
        return "Cheeseburger";
    }

    @Override
    public double cost() {
        return 3.00;
    }
}
