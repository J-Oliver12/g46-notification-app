package org.example.data;

import org.example.model.Notification;

import java.util.Collection;

public interface NotificationManager {

    void createNotification(Notification notification);

    Notification findNotification(String requestId);

    Collection<Notification> findAll();

}
