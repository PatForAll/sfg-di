package com.springframework.property;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
            return "Hello World - Property";
    }
}
