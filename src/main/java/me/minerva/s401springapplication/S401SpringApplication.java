package me.minerva.s401springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S401SpringApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(S401SpringApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }
}
