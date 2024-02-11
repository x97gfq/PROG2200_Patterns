package Observer_2;

import java.util.Observable;
import java.util.Observer;

public class NewsDisplay  implements Observer {

    private String name;

    public NewsDisplay(String name) {
        this.name = name;
    }
    @Override
    public void update(Observable o, Object story) {
        System.out.println(name + " Temperature Update: " + story);
    }
}
