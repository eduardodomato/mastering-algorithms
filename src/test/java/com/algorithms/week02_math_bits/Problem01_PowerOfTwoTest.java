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
        boolean expected = true;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_Example2() {
        int n = 16;
        boolean expected = true;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_Example3() {
        int n = 3;
        boolean expected = false;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_NegativeNumber() {
        int n = -2;
        boolean expected = false;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_Zero() {
        int n = 0;
        boolean expected = false;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_Two() {
        int n = 2;
        boolean expected = true;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_Four() {
        int n = 4;
        boolean expected = true;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_Eight() {
        int n = 8;
        boolean expected = true;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_LargePowerOfTwo() {
        int n = 1024; // 2^10
        boolean expected = true;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_LargeNonPowerOfTwo() {
        int n = 1000;
        boolean expected = false;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_MaxPowerOfTwo() {
        int n = 1073741824; // 2^30 (largest power of 2 in 32-bit signed int)
        boolean expected = true;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_Five() {
        int n = 5;
        boolean expected = false;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsPowerOfTwo_Six() {
        int n = 6;
        boolean expected = false;
        boolean result = solution.isPowerOfTwo(n);
        
        assertEquals(expected, result);
    }
}

