
// Target (what the app expects)
public interface PaymentProcessor {
    boolean pay(String customerId, double amountUsd);
}
