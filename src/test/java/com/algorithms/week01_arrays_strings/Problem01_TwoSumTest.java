package com.algorithms.week01_arrays_strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Two Sum
 */
class Problem01_TwoSumTest {
    
    private Problem01_TwoSum solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_TwoSum();
    }
    
    @Test
    void testTwoSum_BasicExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testTwoSum_BasicExample2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] result = solution.twoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testTwoSum_DuplicateNumbers() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testTwoSum_NegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] expected = {2, 4};
        int[] result = solution.twoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testTwoSum_MixedNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] expected = {0, 2};
        int[] result = solution.twoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testTwoSum_LargeArray() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i;
        }
        int target = 1999; // 999 + 1000
        int[] expected = {999, 1000};
        int[] result = solution.twoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testTwoSum_EdgeCaseTwoElements() {
        int[] nums = {1, 2};
        int target = 3;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        
        assertArrayEquals(expected, result);
    }
}
