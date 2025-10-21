package com.algorithms.week05_stacks_queues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: Daily Temperatures
 */
class Problem02_DailyTemperaturesTest {
    
    private Problem02_DailyTemperatures solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_DailyTemperatures();
    }
    
    @Test
    void testDailyTemperatures_Example1() {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] expected = {1,1,4,2,1,1,0,0};
        int[] result = solution.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testDailyTemperatures_Example2() {
        int[] temperatures = {30,40,50,60};
        int[] expected = {1,1,1,0};
        int[] result = solution.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testDailyTemperatures_Example3() {
        int[] temperatures = {30,60,90};
        int[] expected = {1,1,0};
        int[] result = solution.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testDailyTemperatures_SingleElement() {
        int[] temperatures = {30};
        int[] expected = {0};
        int[] result = solution.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testDailyTemperatures_Decreasing() {
        int[] temperatures = {90,80,70,60};
        int[] expected = {0,0,0,0};
        int[] result = solution.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }
}
