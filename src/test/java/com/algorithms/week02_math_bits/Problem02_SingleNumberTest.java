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
    void testSingleNumber_ThreeElements() {
        int[] nums = {7, 8, 7};
        int expected = 8;
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
        int[] nums = {-5, 10, -5, 10, 3};
        int expected = 3;
        int result = solution.singleNumber(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleNumber_Zero() {
        int[] nums = {0, 5, 5};
        int expected = 0;
        int result = solution.singleNumber(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleNumber_LargeArray() {
        int[] nums = new int[2001];
        for (int i = 0; i < 1000; i++) {
            nums[i * 2] = i;
            nums[i * 2 + 1] = i;
        }
        nums[2000] = 999999; // The single number
        int expected = 999999;
        int result = solution.singleNumber(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleNumber_LargeNumbers() {
        int[] nums = {30000, 30000, 25000};
        int expected = 25000;
        int result = solution.singleNumber(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleNumber_MultipleZeros() {
        int[] nums = {0, 0, 1};
        int expected = 1;
        int result = solution.singleNumber(nums);
        
        assertEquals(expected, result);
    }
}

