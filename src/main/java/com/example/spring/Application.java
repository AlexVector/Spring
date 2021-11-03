package com.example.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository, PostRepository postRepository) {
        return args -> {
            User adm = new User("Admin", "admin@gmail.com", "1234", "Администратор");
            User mod = new User("Moderator", "moderator@gmail.com", "1234", "Модератор");
            User user = new User("User", "user@gmail.com", "1234", "Пользователь");
            userRepository.save(adm);
            userRepository.save(mod);
            userRepository.save(user);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date = Calendar.getInstance().getTime();
            Post mes = new Post(adm.getName(), dateFormat.format(date), "Приветствую!");
            postRepository.save(mes);
            userRepository.findAll().forEach(System.out::println);
            postRepository.findAll().forEach(System.out::println);
        };
    }
}
