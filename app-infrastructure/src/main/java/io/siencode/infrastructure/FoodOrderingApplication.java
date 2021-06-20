package io.siencode.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class FoodOrderingApplication {
    public static void main(String[] args) {
        SpringApplication.run(FoodOrderingApplication.class, args);
    }

}
