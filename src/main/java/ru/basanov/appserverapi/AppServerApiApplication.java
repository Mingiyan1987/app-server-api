package ru.basanov.appserverapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AppServerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppServerApiApplication.class, args);
    }

}
