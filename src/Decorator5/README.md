
# Coffee Decorator Pattern (Java)

This example demonstrates the **Decorator Pattern** using a coffee shop domain.
Start with a base `Coffee` and dynamically add toppings (caramel, whipped cream, chocolate, soy milk), each of which updates the description and the cost without modifying the base class.

## Structure
- `Beverage.java`: Target interface with `getDescription()` and `cost()`.
- `Coffee.java`: Concrete component (plain coffee).
- `CoffeeDecorator.java`: Abstract decorator that wraps a `Beverage`.
- `Caramel.java`, `WhippedCream.java`, `Chocolate.java`, `SoyMilk.java`: Concrete decorators.
- `Main.java`: Demo with several combinations.

## Build & Run
```bash
javac *.java && java Main
```

## Sample Output
```
Plain Coffee -> $2.50
Coffee + Caramel -> $3.00
Coffee + Caramel + Whipped Cream -> $3.50
Coffee + Chocolate + Soy Milk -> $3.75
Custom (order matters) -> $3.75
```

> Note: Prices are illustrative. Decorators are stackable and order-independent here (sum of costs), but order can matter in other domains.
