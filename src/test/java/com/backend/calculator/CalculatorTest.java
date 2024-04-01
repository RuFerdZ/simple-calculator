package com.backend.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CalculatorController.class)
public class CalculatorTest {

    private static final String BASE_ENDPOINT = "/calc";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAdditionEndpoint() throws Exception {
        // Define test data
        int a = 2;
        int b = 3;

        // Send request to endpoint and verify response
        mockMvc.perform(get(BASE_ENDPOINT + "/add")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a + b)));
    }

    @Test
    public void testSubtractionEndpoint() throws Exception {
        // Define test data
        int a = 2;
        int b = 3;

        // Send request to endpoint and verify response
        mockMvc.perform(get(BASE_ENDPOINT + "/subtract")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a - b)));
    }

    @Test
    public void testMultiplicationEndpoint() throws Exception {
        // Define test data
        int a = 2;
        int b = 3;

        // Send request to endpoint and verify response
        mockMvc.perform(get(BASE_ENDPOINT + "/multiply")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a * b)));
    }

    @Test
    public void testDivisionEndpoint() throws Exception {
        // Define test data
        int a = 2;
        int b = 3;

        // Send request to endpoint and verify response
        mockMvc.perform(get(BASE_ENDPOINT + "/divide")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a / b)));
    }

    @Test
    public void testRemainderEndpoint() throws Exception {
        // Define test data
        int a = 2;
        int b = 3;

        // Send request to endpoint and verify response
        mockMvc.perform(get(BASE_ENDPOINT + "/remainder")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a % b)));
    }

    @Test
    public void testConcatenationEndpoint() throws Exception {
        // Define test data
        String a = "Hello";
        String b = "World";

        // Send request to endpoint and verify response
        mockMvc.perform(get(BASE_ENDPOINT + "/concat")
                        .param("a", a)
                        .param("b", b))
                .andExpect(status().isOk())
                .andExpect(content().string(a + b));
    }
}
