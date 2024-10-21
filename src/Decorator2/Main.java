package Decorator2;

public class Main {
    public static void main(String[] args) {


        Burger hamburger = new Hamburger();
        System.out.println("Order: " + hamburger.getDescription());
        System.out.println("Cost: $" + hamburger.cost());

        Burger hamburger2 = new Hamburger();
        Burger lettuceTomoatoBaconCheese = new LettuceDecorator(new TomatoDecorator(new BaconDecorator(new CheeseDecorator(hamburger2))));
        System.out.println("Order: " + lettuceTomoatoBaconCheese.getDescription());
        System.out.println("Cost: $" + lettuceTomoatoBaconCheese.cost());
    }
}
