package com.algorithms.week08_graphs;

/**
 * Problem 1: Number of Islands
 * 
 * LeetCode #200 - Medium
 * 
 * Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), 
 * return the number of islands.
 * 
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally 
 * or vertically. You may assume all four edges of the grid are all surrounded by water.
 * 
 * Constraints:
 * - m == grid.length
 * - n == grid[i].length
 * - 1 <= m, n <= 300
 * - grid[i][j] is '0' or '1'.
 * 
 * Example 1:
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 * 
 * Example 2:
 * Input: grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * Output: 3
 * 
 * Follow-up: Can you solve it using DFS, BFS, and Union-Find?
 */
public class Problem01_NumberOfIslands {
    
    /**
     * Count the number of islands in the grid.
     * 
     * @param grid 2D binary grid representing land and water
     * @return number of islands
     */
    public int numIslands(char[][] grid) {
        // TODO: Implement your solution here
        // Hint: Use DFS to mark all connected land cells as visited
        // Time complexity: O(m * n)
        // Space complexity: O(m * n) for recursion stack
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
