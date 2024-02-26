package Observer.Deprecated;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplay display1 = new WeatherDisplay("Display 1");
        WeatherDisplay display2 = new WeatherDisplay("Display 2");

        // Register observers
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        // Simulate temperature updates
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
    }
}
