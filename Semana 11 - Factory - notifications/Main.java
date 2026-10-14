package notifications;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification email = factory.createNotification("email");
        email.send();

        Notification sms = factory.createNotification("sms");
        sms.send();

        Notification whatsapp = factory.createNotification("whatsapp");
        whatsapp.send();
    }
}