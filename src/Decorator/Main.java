package Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("Order: " + espresso.getDescription());
        System.out.println("Cost: $" + espresso.cost());

        Coffee sugarMilkEspresso = new MilkDecorator(new SugarDecorator(espresso));
        System.out.println("Order: " + sugarMilkEspresso.getDescription());
        System.out.println("Cost: $" + sugarMilkEspresso.cost());
    }
}
