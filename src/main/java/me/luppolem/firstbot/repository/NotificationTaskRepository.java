package me.luppolem.firstbot.repository;

import me.luppolem.firstbot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {

    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime);
    //   List<NotificationTask>findAllByNotificationDateTimeAndChatId(LocalDateTime localDateTime,long chatId);
    //   @Query("SELECT nt FROM NotificationTask nt WHERE nt.user.name like %:nameLike%")
    //List<NotificationTask> findAllByNameLike(@Param("nameLike") String nameLike);
//    @Query(value = "SELECT nt.* FROM notification_tasks nt INNER JOIN user u ON nt.user_id=u.id WHERE u.name like %:nameLike%",nativeQuery = true)
//    List<NotificationTask> findAllByNameLike(@Param("nameLike") String nameLike);
//
//    @Modifying
//    @Query("DELETE FROM NotificationTask WHERE message like %:nameLike%")
//    void removeAllLike(@Param("nameLike") String nameLike);
}
