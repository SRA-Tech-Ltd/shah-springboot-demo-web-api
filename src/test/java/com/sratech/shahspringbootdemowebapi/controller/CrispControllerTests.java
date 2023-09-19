package com.sratech.shahspringbootdemowebapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class CrispControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetCrisp() throws Exception {
        String expected = "I love crisp!";

        this.mockMvc.perform(MockMvcRequestBuilders.get("/crisp"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expected));

    }
}
