package notifications;

import interfaces.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending notification using Email.");
    }
}
