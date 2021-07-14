package com.springframework.property;

import guru.springframework.sfgdi.services.GreetingService;

public class SecondPropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property II";
    }
}
