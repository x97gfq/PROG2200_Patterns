
// Client code — remains unchanged, programs to PaymentProcessor
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new GatewayPaymentAdapter(new ThirdPartyGateway(), "USD");

        processor.pay("cust_123", 19.99);
        processor.pay("cust_456", 0.01);
    }
}
