package com.algorithms.week02_math_bits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: Single Number
 */
class Problem02_SingleNumberTest {
    
    private Problem02_SingleNumber solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_SingleNumber();
    }
    
    @Test
    void testSingleNumber_Example1() {
        int[] nums = {2, 2, 1};
        int expected = 1;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleNumber_Example2() {
        int[] nums = {4, 1, 2, 1, 2};
        int expected = 4;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleNumber_Example3() {
        int[] nums = {1};
        int expected = 1;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleNumber_SingleElement() {
        int[] nums = {5};
        int expected = 5;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleNumber_NegativeNumbers() {
        int[] nums = {-1, -1, -2};
        int expected = -2;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleNumber_MixedNumbers() {
        int[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        int expected = 5;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleNumber_LargeArray() {
        int[] nums = new int[1001];
        for (int i = 0; i < 500; i++) {
            nums[i] = i;
            nums[i + 500] = i;
        }
        nums[1000] = 999; // Single number
        int expected = 999;
        int result = solution.singleNumber(nums);
        assertEquals(expected, result);
    }
}
