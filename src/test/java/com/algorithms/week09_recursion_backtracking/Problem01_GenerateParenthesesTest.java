package com.algorithms.week09_recursion_backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Generate Parentheses
 */
class Problem01_GenerateParenthesesTest {
    
    private Problem01_GenerateParentheses solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_GenerateParentheses();
    }
    
    @Test
    void testGenerateParenthesis_Example1() {
        int n = 3;
        var result = solution.generateParenthesis(n);
        
        assertEquals(5, result.size());
        assertTrue(result.contains("((()))"));
        assertTrue(result.contains("(()())"));
        assertTrue(result.contains("(())()"));
        assertTrue(result.contains("()(())"));
        assertTrue(result.contains("()()()"));
    }
    
    @Test
    void testGenerateParenthesis_Example2() {
        int n = 1;
        var result = solution.generateParenthesis(n);
        
        assertEquals(1, result.size());
        assertEquals("()", result.get(0));
    }
    
    @Test
    void testGenerateParenthesis_N2() {
        int n = 2;
        var result = solution.generateParenthesis(n);
        
        assertEquals(2, result.size());
        assertTrue(result.contains("(())"));
        assertTrue(result.contains("()()"));
    }
}
