package notifications;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "whatsapp":
                return new WhatsAppNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type");
        }
    }
}