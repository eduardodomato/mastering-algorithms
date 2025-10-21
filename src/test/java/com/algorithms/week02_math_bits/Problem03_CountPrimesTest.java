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
    void testCountPrimes_SmallNumbers() {
        assertEquals(0, solution.countPrimes(2)); // No primes less than 2
        assertEquals(1, solution.countPrimes(3)); // Only 2
        assertEquals(2, solution.countPrimes(4)); // 2, 3
        assertEquals(2, solution.countPrimes(5)); // 2, 3
        assertEquals(3, solution.countPrimes(6)); // 2, 3, 5
    }
    
    @Test
    void testCountPrimes_MediumNumbers() {
        assertEquals(25, solution.countPrimes(100)); // 25 primes less than 100
        assertEquals(46, solution.countPrimes(200)); // 46 primes less than 200
    }
    
    @Test
    void testCountPrimes_LargeNumbers() {
        assertEquals(1229, solution.countPrimes(10000)); // 1229 primes less than 10000
    }
    
    @Test
    void testCountPrimes_EdgeCases() {
        assertEquals(0, solution.countPrimes(0));
        assertEquals(0, solution.countPrimes(1));
        assertEquals(0, solution.countPrimes(2));
    }
}
