package com.example.payment_manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentManageApplication.class, args);
    }

}
