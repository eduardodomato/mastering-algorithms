package com.algorithms.week02_math_bits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Count Primes
 */
class Problem03_CountPrimesTest {
    
    private Problem03_CountPrimes solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_CountPrimes();
    }
    
    @Test
    void testCountPrimes_Example1() {
        int n = 10;
        int expected = 4; // 2, 3, 5, 7
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_Example2() {
        int n = 0;
        int expected = 0;
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_Example3() {
        int n = 1;
        int expected = 0;
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_Example4() {
        int n = 2;
        int expected = 0;
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_Example5() {
        int n = 3;
        int expected = 1; // 2
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_Four() {
        int n = 4;
        int expected = 2; // 2, 3
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_Five() {
        int n = 5;
        int expected = 2; // 2, 3
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_Twenty() {
        int n = 20;
        int expected = 8; // 2, 3, 5, 7, 11, 13, 17, 19
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_Fifty() {
        int n = 50;
        int expected = 15; // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_OneHundred() {
        int n = 100;
        int expected = 25;
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_OneThousand() {
        int n = 1000;
        int expected = 168;
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_TenThousand() {
        int n = 10000;
        int expected = 1229;
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testCountPrimes_LargeNumber() {
        int n = 100000;
        int expected = 9592;
        int result = solution.countPrimes(n);
        
        assertEquals(expected, result);
    }
}

