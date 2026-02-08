package notifications;

import interfaces.Notification;

public class WhatsappNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User will be notified on WhatsApp.");
    }
}
