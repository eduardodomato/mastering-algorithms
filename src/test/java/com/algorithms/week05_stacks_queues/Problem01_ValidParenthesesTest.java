package com.algorithms.week05_stacks_queues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Valid Parentheses
 */
class Problem01_ValidParenthesesTest {
    
    private Problem01_ValidParentheses solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_ValidParentheses();
    }
    
    @Test
    void testIsValid_Example1() {
        String s = "()";
        assertTrue(solution.isValid(s));
    }
    
    @Test
    void testIsValid_Example2() {
        String s = "()[]{}";
        assertTrue(solution.isValid(s));
    }
    
    @Test
    void testIsValid_Example3() {
        String s = "(]";
        assertFalse(solution.isValid(s));
    }
    
    @Test
    void testIsValid_Example4() {
        String s = "([)]";
        assertFalse(solution.isValid(s));
    }
    
    @Test
    void testIsValid_Example5() {
        String s = "{[]}";
        assertTrue(solution.isValid(s));
    }
    
    @Test
    void testIsValid_EmptyString() {
        String s = "";
        assertTrue(solution.isValid(s));
    }
    
    @Test
    void testIsValid_OnlyOpen() {
        String s = "(((";
        assertFalse(solution.isValid(s));
    }
    
    @Test
    void testIsValid_OnlyClose() {
        String s = ")))";
        assertFalse(solution.isValid(s));
    }
}
