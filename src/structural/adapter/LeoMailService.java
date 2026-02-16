package structural.adapter;

//third party service
public class LeoMailService {
    public void sendMail(String content, String to, String message) {
        System.out.println("the mail sent with content : " + content + "to the user : " + to + "with message" + message);
    }
}
