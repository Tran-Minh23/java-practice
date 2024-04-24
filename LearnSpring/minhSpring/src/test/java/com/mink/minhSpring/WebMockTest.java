package com.mink.minhSpring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.mink.minhSpring.restservice.Foo;
import com.mink.minhSpring.restservice.GreetingController;

@WebMvcTest(GreetingController.class)
public class WebMockTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Foo service;

    @Test
    void greetingShouldReturnMessageFromService() throws Exception {
        this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk());
    }
}
