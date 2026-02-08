package factory;

import interfaces.Notification;
import notifications.EmailNotification;
import notifications.SMSNotification;
import notifications.WhatsappNotification;

public class NotificationFactory {

    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }

        return switch(channel.toUpperCase()) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            case "WHATSAPP" -> new WhatsappNotification();
            default -> throw new IllegalArgumentException();
        };
    }

}
