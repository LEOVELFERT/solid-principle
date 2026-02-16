package structural.adapter;

public class EmailService implements NotificationService {
    @Override
    public void send(String to, String subject, String content) {
        System.out.println("The mail is sending to :" + to + "with subject : " + subject + "with contet :" + content);
    }
}
