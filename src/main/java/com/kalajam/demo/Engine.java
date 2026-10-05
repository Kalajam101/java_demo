package com.kalajam.demo;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public void start() {
        System.out.println("Vroom! Engine has started successfully.");
    }
}
