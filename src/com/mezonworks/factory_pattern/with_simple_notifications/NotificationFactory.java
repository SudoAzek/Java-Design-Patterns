package com.mezonworks.factory_pattern.with_simple_notifications;

public class NotificationFactory {
    public Notification createNotification(String channel) {
        if(channel == null) {
            return null;
        }
        if(channel.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (channel.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (channel.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }

    return null;
    }
}
