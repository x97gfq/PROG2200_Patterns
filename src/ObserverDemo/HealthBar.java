package ObserverDemo;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class HealthBar implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("health")) {
            int newHealth = (int) evt.getNewValue();
            int oldHealth = (int) evt.getOldValue();
            System.out.println("Health updated - now " + newHealth + " (was " + oldHealth + ")");
        }
    }

}
