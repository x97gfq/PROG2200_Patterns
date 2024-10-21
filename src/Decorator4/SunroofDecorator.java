package Decorator4;
// Adding a sunroof feature
public class SunroofDecorator extends CarDecorator {
    public SunroofDecorator(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Sunroof";
    }
}