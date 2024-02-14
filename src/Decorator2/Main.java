package Decorator2;

public class Main {
    public static void main(String[] args) {


        Burger cheeseBurger = new CheeseBurger();
        System.out.println("Order: " + cheeseBurger.getDescription());
        System.out.println("Cost: $" + cheeseBurger.cost());

        Burger lettuceTomoatoBacon = new BaconDecorator(new TomatoDecorator(new LettuceDecorator(new CheeseDecorator(cheeseBurger))));
        System.out.println("Order: " + lettuceTomoatoBacon.getDescription());
        System.out.println("Cost: $" + lettuceTomoatoBacon.cost());
    }
}
