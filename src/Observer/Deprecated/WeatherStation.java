package Observer.Deprecated;

import java.util.Observable;

// Subject (Publisher)
public class WeatherStation extends Observable {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        setChanged();
        notifyObservers(temperature);
    }
}