package Observer_2.Current;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NewsDisplay implements PropertyChangeListener {
    private String name;

    public NewsDisplay(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyName = evt.getPropertyName();
        if ("news".equals(propertyName)) {
            String newNews = (String) evt.getNewValue();
            System.out.println(name + " News Update: " + newNews);
        }
    }
}

