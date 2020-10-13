package com.mezonworks.factory_pattern.with_simple_notifications;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Receiving an SMS notification...");
    }
}
