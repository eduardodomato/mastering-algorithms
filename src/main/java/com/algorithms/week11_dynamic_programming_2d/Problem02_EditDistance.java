package com.algorithms.week11_dynamic_programming_2d;

/**
 * Problem 2: Edit Distance
 * 
 * LeetCode #72 - Hard
 * 
 * Given two strings word1 and word2, return the minimum number of operations required 
 * to convert word1 to word2.
 * 
 * You have the following three operations permitted on a word:
 * - Insert a character
 * - Delete a character
 * - Replace a character
 * 
 * Constraints:
 * - 0 <= word1.length, word2.length <= 500
 * - word1 and word2 consist of lowercase English letters only.
 * 
 * Example 1:
 * Input: word1 = "horse", word2 = "ros"
 * Output: 3
 * Explanation: 
 * horse -> rorse (replace 'h' with 'r')
 * rorse -> rose (remove 'r')
 * rose -> ros (remove 'e')
 * 
 * Example 2:
 * Input: word1 = "intention", word2 = "execution"
 * Output: 5
 * Explanation: 
 * intention -> inention (remove 't')
 * inention -> enention (replace 'i' with 'e')
 * enention -> exention (replace 'n' with 'x')
 * exention -> exection (replace 'n' with 'c')
 * exection -> execution (insert 'u')
 * 
 * Follow-up: Can you solve it using O(min(m, n)) space?
 */
public class Problem02_EditDistance {
    
    /**
     * Find minimum edit distance between two strings.
     * 
     * @param word1 first string
     * @param word2 second string
     * @return minimum number of operations to convert word1 to word2
     */
    public int minDistance(String word1, String word2) {
        // TODO: Implement your solution here
        // Hint: DP - dp[i][j] = min operations to convert word1[0:i] to word2[0:j]
        // dp[i][j] = min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]) + cost
        // Time complexity: O(m * n)
        // Space complexity: O(m * n) or O(min(m, n)) with optimization
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
