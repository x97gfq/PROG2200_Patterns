package Decorator4;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        System.out.println(basicCar.assemble());

        Car sunroofCar = new SunroofDecorator(new BasicCar());
        System.out.println(sunroofCar.assemble());

        Car sportsRimsCar = new SportsRimsDecorator(new BasicCar());
        System.out.println(sportsRimsCar.assemble());

        Car fullyLoadedCar = new LeatherSeatsDecorator(new SportsRimsDecorator(new SunroofDecorator(new BasicCar())));
        System.out.println(fullyLoadedCar.assemble());
    }
}
