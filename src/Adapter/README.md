
# Adapter Pattern (Java) — Payment Gateway Example

This project demonstrates the **Adapter Pattern** by integrating a third‑party payment gateway with an application that expects a different interface.

## Problem
- Your app expects a `PaymentProcessor` with a simple `pay(customerId, amountUsd)` method.
- A third‑party library exposes a `ThirdPartyGateway#charge(int cents, String token, String currency)` API.
- We cannot change either interface.

## Solution
- Implement `GatewayPaymentAdapter` that **adapts** your app's expected interface to the gateway's API.
- It converts dollars to integer cents, looks up a token for the customer, passes a currency, and handles exceptions.

## Files
- `PaymentProcessor.java` — Target interface used by your application.
- `ThirdPartyGateway.java` — Adaptee (simulated third‑party/legacy API).
- `GatewayPaymentAdapter.java` — The Adapter that bridges `PaymentProcessor` to `ThirdPartyGateway`.
- `Main.java` — Client code demonstrating usage (unchanged by the integration).

## Build & Run (no dependencies)
```bash
javac *.java && java Main
```

### Expected sample output
```
[Gateway] Charged 1999 USD to token=tok_cust_123
[Gateway] Charged 1 USD to token=tok_cust_456
```

## How to extend
- Add multiple providers (e.g., `StripeAdapter`, `PaypalAdapter`) implementing `PaymentProcessor`.
- Centralize token lookup (DB/secret store) inside the adapter or via a service.
- Unit test by swapping in a fake `ThirdPartyGateway` without touching client code.
