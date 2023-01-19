package com.shreyas.app;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockHttpServletRequestDsl;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({CalculatorController.class})
public class CalculatorControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void addTest() throws Exception {
        long a= (long) 12.0;
        long b= (long) 13.0;
        ResultActions result=mockMvc.perform(get("/add").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData=result.andReturn().getResponse().getContentAsString();
        System.out.println(resultData);
        Assertions.assertEquals(resultData, "25");
    }

    @Test
    public void subTest() throws Exception {
        long a=(long) 14.0;
        long b=(long) 4.0;
        ResultActions result = mockMvc.perform(put("/sub").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData = result.andReturn().getResponse().getContentAsString();
        System.out.println(resultData);
        Assertions.assertEquals(resultData, "10");
    }


    @Test
    public void mulTest() throws Exception{
        long a= (long) 10.0;
        long b= (long) 3.0;
        ResultActions result = mockMvc.perform(post("/mul").param("a",String.valueOf(a)).param("b", String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData = result.andReturn().getResponse().getContentAsString();
        System.out.println(resultData);
        Assertions.assertEquals(resultData, "30");
    }

    @Test
    public void divTest() throws Exception{
        long a= (long) 10.0;
        long b= (long) 2.0;
        ResultActions result = mockMvc.perform(delete("/div").param("a",String.valueOf(a)).param("b", String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData = result.andReturn().getResponse().getContentAsString();
        System.out.println(resultData);
        Assertions.assertEquals(resultData, "5");
    }




}
