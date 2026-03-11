package behavioural.strategy;
// Ultimate Memory Trick
//
//Factory → Create Different Objects
//Strategy → Same Object, Different Behavior
public class Client {
    public static void main(String[] args) {
        PaymentService service = new PaymentService(new CreditCardStrategy());
        service.pay();
    }
}
