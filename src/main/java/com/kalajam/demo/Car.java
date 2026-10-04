package com.kalajam.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    
    private Engine engine;

    // This setter method is where Spring injects our Engine instance automatically
    @Autowired
    public void setEngine(Engine engine) {
        System.out.println("Spring framework called this setter to inject the Engine dependency!");
        this.engine = engine;
    }

    public void drive() {
        engine.start();
    }
}
