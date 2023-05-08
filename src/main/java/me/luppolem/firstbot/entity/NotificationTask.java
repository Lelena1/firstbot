package me.luppolem.firstbot.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification_tasks")
public class NotificationTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String message;
    private long chatId;
    private LocalDateTime notificationDateTime;
    @OneToOne
    private User user;


    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public long getChatId() {
        return chatId;
    }

    public LocalDateTime getNotificationDateTime() {
        return notificationDateTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public void setNotificationDateTime(LocalDateTime notificationDateTime) {
        this.notificationDateTime = notificationDateTime;
    }
}
