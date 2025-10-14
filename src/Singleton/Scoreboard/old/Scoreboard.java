package Singleton.Scoreboard.old;

public class Scoreboard {
    private String[] players;
    private int[] scores;
    private int size;

    // Private constructor
    public Scoreboard(int capacity) {
        players = new String[capacity];
        scores = new int[capacity];
        size = 0;
    }

    // Add or update score
    public void addScore(String player, int points) {
        for (int i = 0; i < size; i++) {
            if (players[i].equals(player)) {
                scores[i] += points;
                return;
            }
        }
        if (size < players.length) {
            players[size] = player;
            scores[size] = points;
            size++;
        } else {
            System.out.println("Scoreboard is full!");
        }
    }

    // Display all scores
    public void displayScores() {
        System.out.println("=== Scoreboard ===");
        for (int i = 0; i < size; i++) {
            System.out.println(players[i] + ": " + scores[i]);
        }
    }
}