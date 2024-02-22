package Decorator3;

public class Main {

    public static void main(String[] args) {

        PizzaDough pd = new PizzaDough();

        Pizza pizza = new SauceDecorator(pd);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.price());


        Pizza gDough = new PizzaDough();

        Pizza gPizza = new CheeseDecorator(new SauceDecorator(gDough));

        System.out.println(gPizza.getDescription());
        System.out.println(gPizza.price());


        Pizza rDough = new PizzaDough();

        Pizza rPizza = new PepperoniDecorator(new CheeseDecorator(new SauceDecorator(rDough)));

        System.out.println(rPizza.getDescription());
        System.out.println(rPizza.price());

    }
}
