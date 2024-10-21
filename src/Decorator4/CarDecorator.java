package Decorator4;

// The base decorator class
public class CarDecorator implements Car {
    protected Car decoratedCar;

    public CarDecorator(Car car) {
        this.decoratedCar = car;
    }

    @Override
    public String assemble() {
        return decoratedCar.assemble();
    }
}
