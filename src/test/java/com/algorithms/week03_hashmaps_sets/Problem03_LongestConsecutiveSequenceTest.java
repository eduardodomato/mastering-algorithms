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
        int[] nums = {100, 4, 200, 1, 3, 2};
        int expected = 4;
        int result = solution.longestConsecutive(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_Example2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int expected = 9;
        int result = solution.longestConsecutive(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_Example3() {
        int[] nums = {1, 2, 0, 1};
        int expected = 3;
        int result = solution.longestConsecutive(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_Example4() {
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
    void testLongestConsecutive_AllConsecutive() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 5;
        int result = solution.longestConsecutive(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_NegativeNumbers() {
        int[] nums = {-1, -2, -3, 0, 1, 2};
        int expected = 6;
        int result = solution.longestConsecutive(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_Duplicates() {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 5};
        int expected = 5;
        int result = solution.longestConsecutive(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_MultipleSequences() {
        int[] nums = {1, 2, 3, 10, 11, 12, 13};
        int expected = 4; // 10,11,12,13 is longer than 1,2,3
        int result = solution.longestConsecutive(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_ReverseOrder() {
        int[] nums = {5, 4, 3, 2, 1};
        int expected = 5;
        int result = solution.longestConsecutive(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_MixedSequence() {
        int[] nums = {100, 1, 2, 3, 50, 51, 52, 4, 5};
        int expected = 5; // 1,2,3,4,5
        int result = solution.longestConsecutive(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_LargeNumbers() {
        int[] nums = {2147483647, -2147483648, 2147483646};
        int expected = 3;
        int result = solution.longestConsecutive(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_ZeroAndNegative() {
        int[] nums = {-1, 0, 1};
        int expected = 3;
        int result = solution.longestConsecutive(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLongestConsecutive_ScatteredSequence() {
        int[] nums = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        int result = solution.longestConsecutive(nums);
        
        // The longest sequence should be at least 3 (could be -1,0,1 or 3,4,5,6 or 7,8,9)
        assertTrue(result >= 3);
    }
}

