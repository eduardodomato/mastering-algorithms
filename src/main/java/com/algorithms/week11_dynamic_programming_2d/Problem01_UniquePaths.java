package com.algorithms.week11_dynamic_programming_2d;

/**
 * Problem 1: Unique Paths
 * 
 * LeetCode #62 - Medium
 * 
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner 
 * (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). 
 * The robot can only move either down or right at any point in time.
 * 
 * Given the two integers m and n, return the number of possible unique paths that the robot 
 * can take to reach the bottom-right corner.
 * 
 * Constraints:
 * - 1 <= m, n <= 100
 * 
 * Example 1:
 * Input: m = 3, n = 7
 * Output: 28
 * 
 * Example 2:
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Down -> Down
 * 2. Down -> Down -> Right
 * 3. Down -> Right -> Down
 * 
 * Example 3:
 * Input: m = 7, n = 3
 * Output: 28
 * 
 * Follow-up: Can you solve it using O(min(m, n)) space?
 */
public class Problem01_UniquePaths {
    
    /**
     * Find number of unique paths from top-left to bottom-right.
     * 
     * @param m number of rows
     * @param n number of columns
     * @return number of unique paths
     */
    public int uniquePaths(int m, int n) {
        // TODO: Implement your solution here
        // Hint: DP - paths[i][j] = paths[i-1][j] + paths[i][j-1]
        // Time complexity: O(m * n)
        // Space complexity: O(m * n) or O(min(m, n)) with optimization
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
