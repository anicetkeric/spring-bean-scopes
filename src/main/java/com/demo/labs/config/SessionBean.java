package com.demo.labs.config;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Random;

@Component
@SessionScope
public class SessionBean {

    private final Random random = new Random();
    private final Integer id = random.nextInt(1000);

    public String getSessionInfo() {
        return "Session ID: " + id;
    }
}