package com.algorithms.week09_recursion_backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Word Search
 */
class Problem03_WordSearchTest {
    
    private Problem03_WordSearch solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_WordSearch();
    }
    
    @Test
    void testExist_Example1() {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        assertTrue(solution.exist(board, word));
    }
    
    @Test
    void testExist_Example2() {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "SEE";
        assertTrue(solution.exist(board, word));
    }
    
    @Test
    void testExist_Example3() {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCB";
        assertFalse(solution.exist(board, word));
    }
    
    @Test
    void testExist_SingleCell() {
        char[][] board = {{'A'}};
        String word = "A";
        assertTrue(solution.exist(board, word));
    }
    
    @Test
    void testExist_WordNotFound() {
        char[][] board = {{'A'}};
        String word = "B";
        assertFalse(solution.exist(board, word));
    }
}
