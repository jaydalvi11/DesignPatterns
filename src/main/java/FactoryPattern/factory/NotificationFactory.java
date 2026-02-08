package FactoryPattern.factory;

import FactoryPattern.interfaces.Notification;
import FactoryPattern.notifications.EmailNotification;
import FactoryPattern.notifications.SMSNotification;
import FactoryPattern.notifications.WhatsappNotification;

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
