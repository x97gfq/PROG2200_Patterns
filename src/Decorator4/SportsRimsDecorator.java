package Decorator4;

// Adding sports rims feature
public class SportsRimsDecorator extends CarDecorator {
    public SportsRimsDecorator(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Sports Rims";
    }
}