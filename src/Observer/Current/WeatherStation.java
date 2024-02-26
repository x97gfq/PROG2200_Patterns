package Observer.Current;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

// Subject (Publisher)
public class WeatherStation {
    private int temperature;
    private List<PropertyChangeListener> listeners;

    public WeatherStation() {
        listeners = new ArrayList<>();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        listeners.add(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        listeners.remove(listener);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        int oldTemperature = this.temperature;
        this.temperature = temperature;
        firePropertyChangeEvent("temperature", oldTemperature, temperature);
    }

    private void firePropertyChangeEvent(String propertyName, int oldValue, int newValue) {
        PropertyChangeEvent event = new PropertyChangeEvent(this, propertyName, oldValue, newValue);
        for (PropertyChangeListener listener : listeners) {
            listener.propertyChange(event);
        }
    }
}
