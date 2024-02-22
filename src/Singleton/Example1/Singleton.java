package Singleton.Example1;

public class Singleton {

    private static Singleton instance;
    private static int counter;
    public Singleton(){

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getCounter() {
        return counter;
    }
    public void incrementCounter() {
        counter++;
    }
}