package com.algorithms.week08_graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Number of Islands
 */
class Problem01_NumberOfIslandsTest {
    
    private Problem01_NumberOfIslands solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_NumberOfIslands();
    }
    
    @Test
    void testNumIslands_Example1() {
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        int expected = 1;
        int result = solution.numIslands(grid);
        assertEquals(expected, result);
    }
    
    @Test
    void testNumIslands_Example2() {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        int expected = 3;
        int result = solution.numIslands(grid);
        assertEquals(expected, result);
    }
    
    @Test
    void testNumIslands_NoIslands() {
        char[][] grid = {
            {'0','0','0'},
            {'0','0','0'},
            {'0','0','0'}
        };
        int expected = 0;
        int result = solution.numIslands(grid);
        assertEquals(expected, result);
    }
    
    @Test
    void testNumIslands_SingleIsland() {
        char[][] grid = {{'1'}};
        int expected = 1;
        int result = solution.numIslands(grid);
        assertEquals(expected, result);
    }
}
