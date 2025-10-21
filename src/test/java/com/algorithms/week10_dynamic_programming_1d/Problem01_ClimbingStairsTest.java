package com.algorithms.week10_dynamic_programming_1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Climbing Stairs
 */
class Problem01_ClimbingStairsTest {
    
    private Problem01_ClimbingStairs solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_ClimbingStairs();
    }
    
    @Test
    void testClimbStairs_Example1() {
        int n = 2;
        int expected = 2;
        int result = solution.climbStairs(n);
        assertEquals(expected, result);
    }
    
    @Test
    void testClimbStairs_Example2() {
        int n = 3;
        int expected = 3;
        int result = solution.climbStairs(n);
        assertEquals(expected, result);
    }
    
    @Test
    void testClimbStairs_SingleStep() {
        int n = 1;
        int expected = 1;
        int result = solution.climbStairs(n);
        assertEquals(expected, result);
    }
    
    @Test
    void testClimbStairs_FourSteps() {
        int n = 4;
        int expected = 5; // 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2
        int result = solution.climbStairs(n);
        assertEquals(expected, result);
    }
    
    @Test
    void testClimbStairs_FiveSteps() {
        int n = 5;
        int expected = 8; // Fibonacci sequence
        int result = solution.climbStairs(n);
        assertEquals(expected, result);
    }
}
