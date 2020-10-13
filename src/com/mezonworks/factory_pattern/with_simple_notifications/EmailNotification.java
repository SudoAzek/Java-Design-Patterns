package com.mezonworks.factory_pattern.with_simple_notifications;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Receiving an e-mail notification...");
    }
}
