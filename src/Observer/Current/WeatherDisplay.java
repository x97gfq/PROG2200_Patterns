package Observer.Current;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

// Observers
public class WeatherDisplay implements PropertyChangeListener {
    private String name;

    public WeatherDisplay(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyName = evt.getPropertyName();
        if ("temperature".equals(propertyName)) {
            int newTemperature = (int) evt.getNewValue();
            System.out.println(name + " Temperature Update: " + newTemperature);
        }
    }
}
