package com.demo.labs.config;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;

@Component
@RequestScope
public class RequestBean {

    private final Random random = new Random();
    private final Integer id = random.nextInt(1000);

    public String getRequestInfo() {
        return "Request ID: " + id;
    }
}