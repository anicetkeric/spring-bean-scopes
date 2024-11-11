package com.demo.labs.web;

import com.demo.labs.config.SessionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionScopedController {

    @Autowired
    private SessionBean sessionBean;

    @GetMapping("/session-info")
    public String getSessionInfo() {
        return sessionBean.getSessionInfo();
    }
}