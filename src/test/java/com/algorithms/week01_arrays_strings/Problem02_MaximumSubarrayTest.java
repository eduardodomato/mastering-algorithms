package com.algorithms.week01_arrays_strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: Maximum Subarray
 */
class Problem02_MaximumSubarrayTest {
    
    private Problem02_MaximumSubarray solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_MaximumSubarray();
    }
    
    @Test
    void testMaxSubArray_Example1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testMaxSubArray_Example2() {
        int[] nums = {1};
        int expected = 1;
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testMaxSubArray_Example3() {
        int[] nums = {5, 4, -1, 7, 8};
        int expected = 23;
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testMaxSubArray_AllNegative() {
        int[] nums = {-5, -4, -1, -7, -8};
        int expected = -1; // Single element subarray
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testMaxSubArray_AllPositive() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 15; // Sum of all elements
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testMaxSubArray_MixedWithZero() {
        int[] nums = {-1, 0, -2};
        int expected = 0; // Single zero element
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testMaxSubArray_LargeArray() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = (i % 2 == 0) ? 1 : -1;
        }
        int result = solution.maxSubArray(nums);
        
        // Should be positive (at least 1)
        assertTrue(result > 0);
    }
    
    @Test
    void testMaxSubArray_SingleNegative() {
        int[] nums = {-5};
        int expected = -5;
        int result = solution.maxSubArray(nums);
        
        assertEquals(expected, result);
    }
}
