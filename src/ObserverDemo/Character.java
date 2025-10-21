package ObserverDemo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeSupport;

public class Character {
    
    private int health;
    private PropertyChangeSupport support;

    public Character(int initialHealth) {
        this.health = initialHealth;
        this.support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        int oldHealth = this.health;
        this.health = newHealth;
        support.firePropertyChange("health", oldHealth, newHealth);
    }
}
