package com.algorithms.week07_heaps_priorityqueues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Kth Largest Element in an Array
 */
class Problem01_KthLargestElementInArrayTest {
    
    private Problem01_KthLargestElementInArray solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_KthLargestElementInArray();
    }
    
    @Test
    void testFindKthLargest_Example1() {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int expected = 5;
        int result = solution.findKthLargest(nums, k);
        assertEquals(expected, result);
    }
    
    @Test
    void testFindKthLargest_Example2() {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int expected = 4;
        int result = solution.findKthLargest(nums, k);
        assertEquals(expected, result);
    }
    
    @Test
    void testFindKthLargest_SingleElement() {
        int[] nums = {1};
        int k = 1;
        int expected = 1;
        int result = solution.findKthLargest(nums, k);
        assertEquals(expected, result);
    }
    
    @Test
    void testFindKthLargest_AllSame() {
        int[] nums = {2,2,2,2};
        int k = 2;
        int expected = 2;
        int result = solution.findKthLargest(nums, k);
        assertEquals(expected, result);
    }
}
