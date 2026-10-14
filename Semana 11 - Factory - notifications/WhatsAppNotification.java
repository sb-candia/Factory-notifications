package notifications;

public class WhatsAppNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending a WhatsApp notification...");
    }
}