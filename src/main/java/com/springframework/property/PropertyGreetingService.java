package com.springframework.property;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
            return "Hello World - Property";
    }
}
