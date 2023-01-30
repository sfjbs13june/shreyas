package com.shreyas.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shreyas.app.controller.HeaderController;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest({HeaderController.class})
@ActiveProfiles(value = "test")
public class HeaderIntegrationTest {
    @Autowired
    private MockMvc mockMvc;
    @Value("${post.url}")
    String posturl;

    private String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}