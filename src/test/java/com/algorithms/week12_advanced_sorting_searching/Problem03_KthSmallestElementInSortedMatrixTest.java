package com.algorithms.week12_advanced_sorting_searching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Kth Smallest Element in a Sorted Matrix
 */
class Problem03_KthSmallestElementInSortedMatrixTest {
    
    private Problem03_KthSmallestElementInSortedMatrix solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_KthSmallestElementInSortedMatrix();
    }
    
    @Test
    void testKthSmallest_Example1() {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        int expected = 13;
        int result = solution.kthSmallest(matrix, k);
        assertEquals(expected, result);
    }
    
    @Test
    void testKthSmallest_Example2() {
        int[][] matrix = {{-5}};
        int k = 1;
        int expected = -5;
        int result = solution.kthSmallest(matrix, k);
        assertEquals(expected, result);
    }
    
    @Test
    void testKthSmallest_SmallMatrix() {
        int[][] matrix = {{1,2},{3,4}};
        int k = 2;
        int expected = 2;
        int result = solution.kthSmallest(matrix, k);
        assertEquals(expected, result);
    }
    
    @Test
    void testKthSmallest_K1() {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 1;
        int expected = 1;
        int result = solution.kthSmallest(matrix, k);
        assertEquals(expected, result);
    }
    
    @Test
    void testKthSmallest_KEqualsN() {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 9; // Last element
        int expected = 15;
        int result = solution.kthSmallest(matrix, k);
        assertEquals(expected, result);
    }
}
