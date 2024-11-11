package com.demo.labs.web;

import com.demo.labs.config.RequestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestScopedController {

    @Autowired
    private RequestBean requestBean;

    @GetMapping("/request-info")
    public String getRequestInfo() {
        return requestBean.getRequestInfo();
    }
}