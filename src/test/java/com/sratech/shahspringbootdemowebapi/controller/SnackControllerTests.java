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
public class SnacksControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetSnacksWithoutQueryParam() throws Exception {

        String expected = "crisp";

        this.mockMvc.perform(MockMvcRequestBuilders.get("/snacks"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(expected));


    }

    @Test
    public void testGetSnacksWithQueryParam() throws Exception {

        String expected = "bhelpuri";

        this.mockMvc.perform(MockMvcRequestBuilders.get("/snacks").queryParam("name", "bhelpuri"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(expected));


    }
}
