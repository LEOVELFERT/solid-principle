package behavioural.strategy;

public class DebitCardStrategy implements PaymentStrategy{
    @Override
    public void processPayment() {
        /// dif alogorithm
        System.out.println("payment done via Debit card.......");
    }
}
