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

        switch (channel.toUpperCase()) {
            case "SMS" :
                return new SMSNotification();
            case "EMAIL" :
                return new EmailNotification();
            case "WHATSAPP" :
                return new WhatsappNotification();
            default :
                throw new IllegalArgumentException();
        }
    }

}
