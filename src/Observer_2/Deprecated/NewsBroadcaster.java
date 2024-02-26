package Observer_2.Deprecated;

import java.util.Observable;

public class NewsBroadcaster extends Observable {

    private String story;

    public void setNews(String story) {
        this.story = story;
        setChanged();
        notifyObservers(story);
    }

}
