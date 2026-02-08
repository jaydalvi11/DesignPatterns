package notifications;

import interfaces.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User is notified using SMS.");
    }
}
