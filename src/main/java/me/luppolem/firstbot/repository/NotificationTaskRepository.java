package me.luppolem.firstbot.repository;

import me.luppolem.firstbot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask,Long> {
}
