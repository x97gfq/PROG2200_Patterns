package Observer_2.Current;

public class Main {
    public static void main(String[] args) {
        NewsBroadcaster newsBroadcaster = new NewsBroadcaster();

        NewsDisplay display1 = new NewsDisplay("JamieDevice");
        NewsDisplay display2 = new NewsDisplay("FredDevice");

        // Register observers
        newsBroadcaster.addPropertyChangeListener(display1);
        newsBroadcaster.addPropertyChangeListener(display2);

        // Simulate news updates
        newsBroadcaster.setNews("Nova Scotia saw its most devastating wildfire season on record in 2023");
        newsBroadcaster.setNews("How a horse drug case has led to calls for change in Atlantic Canada's harness racing industry");
        newsBroadcaster.setNews("Thousands gather, dress up for annual sci-fi convention in Halifax");
        newsBroadcaster.setNews("Search for driver who fled after head-on collision enters second day");
    }
}
