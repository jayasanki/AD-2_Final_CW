package com.example.user_mange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserMangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMangeApplication.class, args);
    }

}
