package org.example;

import org.example.data.NotificationManager;
import org.example.data.NotificationManagerImpl;
import org.example.exception.NotificationExceptionHandler;
import org.example.model.EmailNotification;
import org.example.model.Notification;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        try {
            NotificationManager notificationManager = new NotificationManagerImpl();
            Notification notification1 = new EmailNotification("test2@teste.se", "Meeting Reminder", "Don´t forget the meeting at 15:00");
            notification1.send();
            notificationManager.createNotification(notification1);

            notificationManager.findAll().forEach(notification -> System.out.println(notification.summary()));

        } catch ( Exception e) {
            NotificationExceptionHandler.handleException(e);
        }
    }
}
