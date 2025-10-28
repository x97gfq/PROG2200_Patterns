
// Adapter (bridges PaymentProcessor to ThirdPartyGateway)
public class GatewayPaymentAdapter implements PaymentProcessor {
    private final ThirdPartyGateway gateway;
    private final String defaultCurrency;

    public GatewayPaymentAdapter(ThirdPartyGateway gateway, String defaultCurrency) {
        this.gateway = gateway;
        this.defaultCurrency = defaultCurrency;
    }

    @Override
    public boolean pay(String customerId, double amountUsd) {
        try {
            int cents = (int) Math.round(amountUsd * 100.0);
            String token = lookupCustomerToken(customerId);
            gateway.charge(cents, token, defaultCurrency);
            return true;
        } catch (Exception e) {
            System.err.println("[Adapter] Payment failed: " + e.getMessage());
            return false;
        }
    }

    // Simulated token lookup; replace with DB/secret manager as needed
    private String lookupCustomerToken(String customerId) {
        return "tok_" + customerId;
    }
}
