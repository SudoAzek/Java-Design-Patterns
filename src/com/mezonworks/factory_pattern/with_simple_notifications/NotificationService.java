package com.mezonworks.factory_pattern.with_simple_notifications;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification1 = notificationFactory.createNotification("SMS");
        notification1.notifyUser();

        Notification notification2 = notificationFactory.createNotification("email");
        notification2.notifyUser();

        Notification notification3 = notificationFactory.createNotification("pUSh");
        notification3.notifyUser();
    }
}
