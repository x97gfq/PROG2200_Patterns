package Observer_2;

import java.util.Observable;

public class NewsBroadcaster extends Observable {

    private String story;

    public void setNews(String story) {
        this.story = story;
        setChanged();
        notifyObservers(story);
    }

}
