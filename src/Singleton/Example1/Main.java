package Singleton.Example1;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        s1.incrementCounter();
        System.out.println(s1.getCounter());

        Singleton s2 = Singleton.getInstance();
        s2.incrementCounter();
        System.out.println(s2.getCounter());
    }
}