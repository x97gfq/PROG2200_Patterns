
    import java.util.*;

    /**
     * PosDemo simulates a simple POS (Point-of-Sale) flow that builds a Beverage
     * dynamically from user selections (e.g., from a touchscreen or scanner input).
     *
     * Usage examples:
     *   java PosDemo "caramel,whipped,soy"
     *   java PosDemo "chocolate"
     *   java PosDemo   // interactive mode
     */
    public class PosDemo {

        private static final Map<String, java.util.function.Function<Beverage, Beverage>> DECORATORS = new HashMap<>();
        static {
            DECORATORS.put("caramel", Caramel::new);
            DECORATORS.put("whipped", WhippedCream::new);
            DECORATORS.put("whip", WhippedCream::new); // alias
            DECORATORS.put("chocolate", Chocolate::new);
            DECORATORS.put("cocoa", Chocolate::new);    // alias
            DECORATORS.put("soy", SoyMilk::new);
            DECORATORS.put("soy milk", SoyMilk::new);
        }

        public static void main(String[] args) {
            if (args.length > 0) {
                // Non-interactive: toppings passed as a single comma-separated argument
                String selectionsCsv = args[0];
                Beverage b = buildBeverageFromCsv(selectionsCsv);
                printReceipt(b, selectionsCsv);
                return;
            }

            // Interactive POS-like mode
            Scanner sc = new Scanner(System.in);
            System.out.println("=== Coffee POS ===");
            System.out.println("Base: Plain Coffee ($2.50)");
            System.out.println("Available add-ons: caramel ($0.50), whipped ($0.50), chocolate ($0.75), soy ($0.50)");
            System.out.println("Type add-ons separated by commas (e.g., caramel,whipped,soy) or press Enter for none:");
            System.out.print("> ");
            String line = sc.nextLine().trim();
            Beverage b = buildBeverageFromCsv(line);
            printReceipt(b, line);
        }

        private static Beverage buildBeverageFromCsv(String csv) {
            Beverage beverage = new Coffee(); // base
            if (csv == null || csv.isEmpty()) {
                return beverage;
            }
            String[] tokens = Arrays.stream(csv.split(","))
                                    .map(String::trim)
                                    .filter(s -> !s.isEmpty())
                                    .toArray(String[]::new);
            for (String t : tokens) {
                String key = t.toLowerCase();
                java.util.function.Function<Beverage, Beverage> decorator = DECORATORS.get(key);
                if (decorator != null) {
                    beverage = decorator.apply(beverage);
                } else {
                    System.out.println("[WARN] Unknown add-on ignored: " + t);
                }
            }
            return beverage;
        }

        private static void printReceipt(Beverage beverage, String selections) {
            System.out.println("=== Receipt ===");
            System.out.println("Order: " + (selections == null || selections.isEmpty() ? "Plain Coffee" : ("Coffee + " + selections)));
            System.out.println("Itemized: " + beverage.getDescription());
            System.out.printf("Total: $%.2f%n", beverage.cost());
        }
    }
