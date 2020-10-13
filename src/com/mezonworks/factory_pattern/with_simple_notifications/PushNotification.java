package com.mezonworks.factory_pattern.with_simple_notifications;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Receiving a push notification...");
    }
}
