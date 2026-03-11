package behavioural.strategy;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void pay() {
        paymentStrategy.processPayment();
    }
}
