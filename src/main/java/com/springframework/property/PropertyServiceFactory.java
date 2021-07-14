package com.springframework.property;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyServiceFactory {

    public GreetingService getPropertyService(String type) {
        switch(type) {
            case "first":
                return new PropertyGreetingService();
            case "second":
                return new SecondPropertyGreetingService();
            default:
                return null;
        }
    }
}
