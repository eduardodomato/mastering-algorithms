package com.algorithms.week07_heaps_priorityqueues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Find Median from Data Stream
 */
class Problem03_FindMedianFromDataStreamTest {
    
    private Problem03_FindMedianFromDataStream solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_FindMedianFromDataStream();
    }
    
    @Test
    void testFindMedian_Example1() {
        solution.addNum(1);
        solution.addNum(2);
        assertEquals(1.5, solution.findMedian(), 0.001);
        
        solution.addNum(3);
        assertEquals(2.0, solution.findMedian(), 0.001);
    }
    
    @Test
    void testFindMedian_SingleNumber() {
        solution.addNum(1);
        assertEquals(1.0, solution.findMedian(), 0.001);
    }
    
    @Test
    void testFindMedian_TwoNumbers() {
        solution.addNum(1);
        solution.addNum(2);
        assertEquals(1.5, solution.findMedian(), 0.001);
    }
    
    @Test
    void testFindMedian_OddCount() {
        solution.addNum(1);
        solution.addNum(2);
        solution.addNum(3);
        assertEquals(2.0, solution.findMedian(), 0.001);
    }
}
