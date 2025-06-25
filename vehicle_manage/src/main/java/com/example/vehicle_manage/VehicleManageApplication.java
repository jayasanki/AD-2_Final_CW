package com.example.vehicle_manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VehicleManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleManageApplication.class, args);
    }
}
