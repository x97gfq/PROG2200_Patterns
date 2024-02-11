package Singleton.Example3;

public class Main {
    public static void main(String[] args) {
        LogWriter logWriter = LogWriter.getInstance();
        logWriter.writeLineToFile("This is a test log message.");
        logWriter.writeLineToFile("This is a test log message 2.");
    }
}

