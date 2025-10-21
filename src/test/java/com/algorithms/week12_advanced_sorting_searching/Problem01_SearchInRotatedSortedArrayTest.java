package com.algorithms.week12_advanced_sorting_searching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Search in Rotated Sorted Array
 */
class Problem01_SearchInRotatedSortedArrayTest {
    
    private Problem01_SearchInRotatedSortedArray solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_SearchInRotatedSortedArray();
    }
    
    @Test
    void testSearch_Example1() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int expected = 4;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }
    
    @Test
    void testSearch_Example2() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int expected = -1;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }
    
    @Test
    void testSearch_Example3() {
        int[] nums = {1};
        int target = 0;
        int expected = -1;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }
    
    @Test
    void testSearch_NotRotated() {
        int[] nums = {1,2,3,4,5};
        int target = 3;
        int expected = 2;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }
    
    @Test
    void testSearch_SingleElement() {
        int[] nums = {1};
        int target = 1;
        int expected = 0;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }
    
    @Test
    void testSearch_TwoElements() {
        int[] nums = {3,1};
        int target = 1;
        int expected = 1;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }
}
