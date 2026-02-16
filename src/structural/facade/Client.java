package structural.facade;

public class Client {
    public static void main(String[] args) {
        ApplicationFacade facade = new ApplicationFacade();
        facade.doApplicationBasicActivities();
    }
}
