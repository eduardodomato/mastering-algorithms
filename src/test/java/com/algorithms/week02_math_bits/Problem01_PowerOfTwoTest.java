package com.algorithms.week02_math_bits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Power of Two
 */
class Problem01_PowerOfTwoTest {
    
    private Problem01_PowerOfTwo solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_PowerOfTwo();
    }
    
    @Test
    void testIsPowerOfTwo_Example1() {
        int n = 1;
        assertTrue(solution.isPowerOfTwo(n));
    }
    
    @Test
    void testIsPowerOfTwo_Example2() {
        int n = 16;
        assertTrue(solution.isPowerOfTwo(n));
    }
    
    @Test
    void testIsPowerOfTwo_Example3() {
        int n = 3;
        assertFalse(solution.isPowerOfTwo(n));
    }
    
    @Test
    void testIsPowerOfTwo_PowerOfTwo() {
        assertTrue(solution.isPowerOfTwo(2));
        assertTrue(solution.isPowerOfTwo(4));
        assertTrue(solution.isPowerOfTwo(8));
        assertTrue(solution.isPowerOfTwo(32));
        assertTrue(solution.isPowerOfTwo(64));
    }
    
    @Test
    void testIsPowerOfTwo_NotPowerOfTwo() {
        assertFalse(solution.isPowerOfTwo(0));
        assertFalse(solution.isPowerOfTwo(6));
        assertFalse(solution.isPowerOfTwo(10));
        assertFalse(solution.isPowerOfTwo(15));
        assertFalse(solution.isPowerOfTwo(100));
    }
    
    @Test
    void testIsPowerOfTwo_NegativeNumbers() {
        assertFalse(solution.isPowerOfTwo(-1));
        assertFalse(solution.isPowerOfTwo(-16));
        assertFalse(solution.isPowerOfTwo(-32));
    }
    
    @Test
    void testIsPowerOfTwo_LargeNumbers() {
        assertTrue(solution.isPowerOfTwo(1073741824)); // 2^30
        assertFalse(solution.isPowerOfTwo(1073741825));
    }
}
