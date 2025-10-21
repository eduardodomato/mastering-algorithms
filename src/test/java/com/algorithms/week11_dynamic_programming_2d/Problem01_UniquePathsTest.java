package com.algorithms.week11_dynamic_programming_2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Unique Paths
 */
class Problem01_UniquePathsTest {
    
    private Problem01_UniquePaths solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_UniquePaths();
    }
    
    @Test
    void testUniquePaths_Example1() {
        int m = 3;
        int n = 7;
        int expected = 28;
        int result = solution.uniquePaths(m, n);
        assertEquals(expected, result);
    }
    
    @Test
    void testUniquePaths_Example2() {
        int m = 3;
        int n = 2;
        int expected = 3;
        int result = solution.uniquePaths(m, n);
        assertEquals(expected, result);
    }
    
    @Test
    void testUniquePaths_Example3() {
        int m = 7;
        int n = 3;
        int expected = 28;
        int result = solution.uniquePaths(m, n);
        assertEquals(expected, result);
    }
    
    @Test
    void testUniquePaths_SingleRow() {
        int m = 1;
        int n = 5;
        int expected = 1;
        int result = solution.uniquePaths(m, n);
        assertEquals(expected, result);
    }
    
    @Test
    void testUniquePaths_SingleColumn() {
        int m = 5;
        int n = 1;
        int expected = 1;
        int result = solution.uniquePaths(m, n);
        assertEquals(expected, result);
    }
    
    @Test
    void testUniquePaths_Square() {
        int m = 2;
        int n = 2;
        int expected = 2;
        int result = solution.uniquePaths(m, n);
        assertEquals(expected, result);
    }
}
