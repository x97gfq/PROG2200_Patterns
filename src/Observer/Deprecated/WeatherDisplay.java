package Observer.Deprecated;

import java.util.Observable;
import java.util.Observer;

// Observers
public class WeatherDisplay implements Observer {
    private String name;

    public WeatherDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object temperature) {
        System.out.println(name + " Temperature Update: " + temperature);
    }
}