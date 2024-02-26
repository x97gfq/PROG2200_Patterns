package Decorator2;

public class Main {
    public static void main(String[] args) {


        Burger cheeseBurger = new CheeseBurger();
        System.out.println("Order: " + cheeseBurger.getDescription());
        System.out.println("Cost: $" + cheeseBurger.cost());

        Burger lettuceTomoatoBaconCheese = new LettuceDecorator(new TomatoDecorator(new BaconDecorator(new CheeseDecorator(cheeseBurger))));
        System.out.println("Order: " + lettuceTomoatoBaconCheese.getDescription());
        System.out.println("Cost: $" + lettuceTomoatoBaconCheese.cost());
    }
}
