package com.algorithms.week09_recursion_backtracking;

import java.util.List;

/**
 * Problem 1: Generate Parentheses
 * 
 * LeetCode #22 - Medium
 * 
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * 
 * Constraints:
 * - 1 <= n <= 8
 * 
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * 
 * Example 2:
 * Input: n = 1
 * Output: ["()"]
 * 
 * Follow-up: Can you solve it using both recursion and iteration?
 */
public class Problem01_GenerateParentheses {
    
    /**
     * Generate all combinations of well-formed parentheses.
     * 
     * @param n number of pairs of parentheses
     * @return list of all valid combinations
     */
    public List<String> generateParenthesis(int n) {
        // TODO: Implement your solution here
        // Hint: Use backtracking - add '(' or ')' based on constraints
        // Constraints: open < n, close < open
        // Time complexity: O(4^n / sqrt(n)) - Catalan number
        // Space complexity: O(n) for recursion stack
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
