package com.algorithms.week12_advanced_sorting_searching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: Find Peak Element
 */
class Problem02_FindPeakElementTest {
    
    private Problem02_FindPeakElement solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_FindPeakElement();
    }
    
    @Test
    void testFindPeakElement_Example1() {
        int[] nums = {1,2,3,1};
        int result = solution.findPeakElement(nums);
        assertEquals(2, result); // Peak at index 2 (value 3)
    }
    
    @Test
    void testFindPeakElement_Example2() {
        int[] nums = {1,2,1,3,5,6,4};
        int result = solution.findPeakElement(nums);
        // Should return either index 1 (value 2) or index 5 (value 6)
        assertTrue(result == 1 || result == 5);
    }
    
    @Test
    void testFindPeakElement_SingleElement() {
        int[] nums = {1};
        int expected = 0;
        int result = solution.findPeakElement(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testFindPeakElement_TwoElements() {
        int[] nums = {1,2};
        int expected = 1;
        int result = solution.findPeakElement(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testFindPeakElement_Increasing() {
        int[] nums = {1,2,3,4,5};
        int expected = 4;
        int result = solution.findPeakElement(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testFindPeakElement_Decreasing() {
        int[] nums = {5,4,3,2,1};
        int expected = 0;
        int result = solution.findPeakElement(nums);
        assertEquals(expected, result);
    }
}
