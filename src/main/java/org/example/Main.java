package org.example;

import FactoryPattern.factory.NotificationFactory;
import FactoryPattern.interfaces.Notification;

public class Main {
    static void main() {
        NotificationFactory factory = new NotificationFactory();

        Notification n1 = factory.createNotification("email");
        n1.notifyUser();

        Notification n2 = factory.createNotification("whatsapp");
        n2.notifyUser();
    }
}
