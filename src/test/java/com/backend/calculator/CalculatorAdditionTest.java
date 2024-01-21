package com.backend.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CalculatorController.class)
public class CalculatorAdditionTest {

    private static final String BASE_ENDPOINT = "/calc";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAdditionEndpoint() throws Exception {
        // Given
        int a = 2;
        int b = 3;

        // When and Then
        mockMvc.perform(get(BASE_ENDPOINT + "/add")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a + b)));
    }

    @Test
    public void testAdditionEndpointWithNegativeNumbers() throws Exception {
        // Given
        int a = -2;
        int b = -3;

        // When and Then
        mockMvc.perform(get(BASE_ENDPOINT + "/add")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a + b)));
    }

    @Test
    public void testAdditionEndpointWithZero() throws Exception {
        // Given
        int a = 0;
        int b = 0;

        // When and Then
        mockMvc.perform(get(BASE_ENDPOINT + "/add")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a + b)));
    }

    @Test
    public void testAdditionEndpointWithLargeNumbers() throws Exception {
        // Given
        int a = 1000000000;
        int b = 1000000000;

        // When and Then
        mockMvc.perform(get(BASE_ENDPOINT + "/add")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a + b)));
    }

    @Test
    public void testAdditionEndpointWithLargeNegativeNumbers() throws Exception {
        // Given
        int a = -1000000000;
        int b = -1000000000;

        // When and Then
        mockMvc.perform(get(BASE_ENDPOINT + "/add")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a + b)));
    }

    @Test
    public void testAdditionEndpointWithLargePositiveAndNegativeNumbers() throws Exception {
        // Given
        int a = 1000000000;
        int b = -1000000000;

        // When and Then
        mockMvc.perform(get(BASE_ENDPOINT + "/add")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a + b)));
    }

    @Test
    public void testAdditionEndpointWithLargeNegativeAndPositiveNumbers() throws Exception {
        // Given
        int a = -1000000000;
        int b = 1000000000;

        // When and Then
        mockMvc.perform(get(BASE_ENDPOINT + "/add")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a + b)));
    }

    @Test
    public void testAdditionEndpointWithLargePositiveAndZero() throws Exception {
        // Given
        int a = 1000000000;
        int b = 0;

        // When and Then
        mockMvc.perform(get(BASE_ENDPOINT + "/add")
                        .param("a", String.valueOf(a))
                        .param("b", String.valueOf(b)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(a + b)));
    }

}
