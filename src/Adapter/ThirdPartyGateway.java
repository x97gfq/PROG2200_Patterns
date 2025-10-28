
// Adaptee (third‑party/legacy API)
public class ThirdPartyGateway {
    // Expects integer cents, a token, and a currency code; throws on error
    public void charge(int amountInCents, String token, String currency) throws Exception {
        if (amountInCents <= 0) throw new Exception("Invalid amount");
        // Imagine network call here...
        System.out.printf("[Gateway] Charged %d %s to token=%s%n", amountInCents, currency, token);
    }
}
