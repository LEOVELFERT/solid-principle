package structural.adapter;
//https://www.oodesign.com/adapter-pattern/
public class Client {
    public static void main(String[] args) {

        NotificationService emailService = new EmailService();
        emailService.send("leovelbertv@gmail.com", "nandri vanakkam", "Leo padichchu vaalkaila urupuuda valiya paaruda");

        NotificationService leoMailService = new LeoMailServiceAdapter(new LeoMailService());
        emailService.send("leovelbertv@gmail.com", "nandri vanakkam", "Leo padichchu vaalkaila urupuuda valiya paaruda");
    }
}
