package ObserverDemo;

public class Game {
    public static void main(String[] args) {
        
        Character player1 = new Character(100);
        HealthBar healthBar = new HealthBar();

        player1.addPropertyChangeListener(healthBar);

        player1.setHealth(99);
        player1.setHealth(98);
        player1.setHealth(97);
    }
}
