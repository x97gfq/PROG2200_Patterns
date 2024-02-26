package Observer_2.Current;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NewsBroadcaster {
    private String news;
    private PropertyChangeSupport support;

    public NewsBroadcaster() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        String oldNews = this.news;
        this.news = news;
        support.firePropertyChange("news", oldNews, news);
    }
}

