package Decorator4;

// Adding leather seats feature
public class LeatherSeatsDecorator extends CarDecorator {
    public LeatherSeatsDecorator(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Leather Seats";
    }
}