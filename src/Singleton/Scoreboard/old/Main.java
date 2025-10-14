package Singleton.Scoreboard.old;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Scoreboard board = new Scoreboard(5);

        board.addScore("Alice", 10);
        board.addScore("Bob", 15);
        board.addScore("Alice", 5); // Update Alice's score
        board.addScore("Charlie", 20);

        board.displayScores();

        // Prove singleton
        Scoreboard anotherBoard = new Scoreboard(5);
        anotherBoard.addScore("Dana", 12);

        System.out.println("\nAfter adding Dana via anotherBoard:");
        board.displayScores(); // Same instance, updated scores
    }
}
