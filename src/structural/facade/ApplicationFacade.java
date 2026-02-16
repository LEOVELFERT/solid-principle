package structural.facade;

public class ApplicationFacade {

    private OrderService orderService;
    private UserService userService;
    private PaymentService paymentService;

    public ApplicationFacade(){
        this.orderService=new OrderService();
        this.userService=new UserService();
        this.paymentService= new PaymentService();
    }

    public void doApplicationBasicActivities(){
        orderService.order("235");
        userService.addUser("leo");
        paymentService.pay(2400);
    }
}
