package com.demo.labs.web;

import com.demo.labs.config.RequestBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(RequestScopedController.class)
class RequestScopedControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private RequestBean requestBean;


    @Test
    void testProcessRequest_differentData() throws Exception {
        // Perform a mock GET request to the controller with different data
        mockMvc.perform(get("/request-info"))
                .andExpect(status().isOk())
                .andExpect(content().string("Processed data: anotherData"));
    }

}