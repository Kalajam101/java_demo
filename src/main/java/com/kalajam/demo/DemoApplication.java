package com.kalajam.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // Start Spring and capture the application context
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        
        // Retrieve the Car bean that Spring automatically managed and injected
        Car myCar = context.getBean(Car.class);
        
        // Test our setter injection
        myCar.drive();
    }
}
