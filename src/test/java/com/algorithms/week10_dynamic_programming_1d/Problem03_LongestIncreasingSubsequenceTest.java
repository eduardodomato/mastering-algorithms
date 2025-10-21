package com.algorithms.week10_dynamic_programming_1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Longest Increasing Subsequence
 */
class Problem03_LongestIncreasingSubsequenceTest {
    
    private Problem03_LongestIncreasingSubsequence solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_LongestIncreasingSubsequence();
    }
    
    @Test
    void testLengthOfLIS_Example1() {
        int[] nums = {10,9,2,5,3,7,101,18};
        int expected = 4; // [2,3,7,18]
        int result = solution.lengthOfLIS(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLIS_Example2() {
        int[] nums = {0,1,0,3,2,3};
        int expected = 4; // [0,1,2,3]
        int result = solution.lengthOfLIS(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLIS_Example3() {
        int[] nums = {7,7,7,7,7,7,7};
        int expected = 1; // [7]
        int result = solution.lengthOfLIS(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLIS_SingleElement() {
        int[] nums = {1};
        int expected = 1;
        int result = solution.lengthOfLIS(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLIS_Increasing() {
        int[] nums = {1,2,3,4,5};
        int expected = 5;
        int result = solution.lengthOfLIS(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLIS_Decreasing() {
        int[] nums = {5,4,3,2,1};
        int expected = 1;
        int result = solution.lengthOfLIS(nums);
        assertEquals(expected, result);
    }
}
