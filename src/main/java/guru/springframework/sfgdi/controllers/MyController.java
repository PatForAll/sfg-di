package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String helloWorld(){
        System.out.println("Hello World!");

        return "Hi folks!";
    }
}
