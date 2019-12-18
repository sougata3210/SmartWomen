package com.smartwomen.app.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@EnableAutoConfiguration
public class SwCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwCustomerApplication.class, args);
    }

}
