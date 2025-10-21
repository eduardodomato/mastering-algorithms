package com.algorithms.week09_recursion_backtracking;

/**
 * Problem 3: Word Search
 * 
 * LeetCode #79 - Medium
 * 
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells 
 * are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * 
 * Constraints:
 * - m == board.length
 * - n = board[i].length
 * - 1 <= m, n <= 6
 * - 1 <= word.length <= 15
 * - board and word consists of only lowercase and uppercase English letters.
 * 
 * Example 1:
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 * 
 * Example 2:
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 * Output: true
 * 
 * Example 3:
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 * Output: false
 * 
 * Follow-up: Can you solve it using DFS and BFS?
 */
public class Problem03_WordSearch {
    
    /**
     * Check if word exists in the board.
     * 
     * @param board 2D character grid
     * @param word word to search for
     * @return true if word exists, false otherwise
     */
    public boolean exist(char[][] board, String word) {
        // TODO: Implement your solution here
        // Hint: Use DFS backtracking from each cell
        // Mark visited cells and backtrack
        // Time complexity: O(m * n * 4^L) where L is word length
        // Space complexity: O(L) for recursion stack
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
