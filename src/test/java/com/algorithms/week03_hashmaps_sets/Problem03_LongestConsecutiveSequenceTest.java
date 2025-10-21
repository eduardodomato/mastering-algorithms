package com.algorithms.week03_hashmaps_sets;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Longest Consecutive Sequence
 */
class Problem03_LongestConsecutiveSequenceTest {
    
    private Problem03_LongestConsecutiveSequence solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_LongestConsecutiveSequence();
    }
    
    @Test
    void testLongestConsecutive_Example1() {
        int[] nums = {100,4,200,1,3,2};
        int expected = 4; // [1,2,3,4]
        int result = solution.longestConsecutive(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_Example2() {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int expected = 9; // [0,1,2,3,4,5,6,7,8]
        int result = solution.longestConsecutive(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_EmptyArray() {
        int[] nums = {};
        int expected = 0;
        int result = solution.longestConsecutive(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_SingleElement() {
        int[] nums = {5};
        int expected = 1;
        int result = solution.longestConsecutive(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_NoConsecutive() {
        int[] nums = {1, 3, 5, 7, 9};
        int expected = 1;
        int result = solution.longestConsecutive(nums);
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_NegativeNumbers() {
        int[] nums = {-1, 0, 1, 2, -2, -3};
        int expected = 4; // [-3,-2,-1,0] or [-1,0,1,2]
        int result = solution.longestConsecutive(nums);
        assertEquals(expected, result);
    }
}
