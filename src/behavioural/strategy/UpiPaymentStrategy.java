package behavioural.strategy;

public class UpiPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment() {
        /// dif alogorithm
        System.out.println("payment done via UPI card.......");
    }
}
