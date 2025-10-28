
public class Main {
    public static void main(String[] args) {
        // Base beverage
        Beverage plain = new Coffee();
        print(plain);

        // Single decorator
        Beverage caramel = new Caramel(new Coffee());
        print(caramel);

        // Stacked decorators
        Beverage caramelWhip = new WhippedCream(new Caramel(new Coffee()));
        print(caramelWhip);

        Beverage chocSoy = new SoyMilk(new Chocolate(new Coffee()));
        print(chocSoy);

        // Custom chain – order can be rearranged without changing the interface
        Beverage custom = new SoyMilk(new WhippedCream(new Chocolate(new Coffee())));
        print(custom);
    }

    private static void print(Beverage b) {
        System.out.printf("%s -> $%.2f%n", b.getDescription(), b.cost());
    }
}
