package structural.adapter;

public class LeoMailServiceAdapter implements NotificationService {
    private LeoMailService leoMailService;

    public LeoMailServiceAdapter(LeoMailService leoMailService) {
        this.leoMailService = leoMailService;
    }

    @Override
    public void send(String to, String subject, String content) {
        leoMailService.sendMail(content, to, subject);
    }
}
