package com.algorithms.week09_recursion_backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: N-Queens
 */
class Problem02_NQueensTest {
    
    private Problem02_NQueens solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_NQueens();
    }
    
    @Test
    void testSolveNQueens_Example1() {
        int n = 4;
        var result = solution.solveNQueens(n);
        
        assertEquals(2, result.size());
        // Should have 2 solutions for 4-queens problem
    }
    
    @Test
    void testSolveNQueens_Example2() {
        int n = 1;
        var result = solution.solveNQueens(n);
        
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals("Q", result.get(0).get(0));
    }
    
    @Test
    void testSolveNQueens_N2() {
        int n = 2;
        var result = solution.solveNQueens(n);
        
        assertEquals(0, result.size()); // No solution for 2-queens
    }
    
    @Test
    void testSolveNQueens_N3() {
        int n = 3;
        var result = solution.solveNQueens(n);
        
        assertEquals(0, result.size()); // No solution for 3-queens
    }
}
