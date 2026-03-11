package behavioural.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void processPayment() {
        /// dif alogorithm
        System.out.println("payment done via credit card.......");
    }
}
