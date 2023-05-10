package me.luppolem.firstbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class FirstBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstBotApplication.class, args);
    }

}
