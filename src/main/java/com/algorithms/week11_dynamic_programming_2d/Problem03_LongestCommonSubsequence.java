package com.algorithms.week11_dynamic_programming_2d;

/**
 * Problem 3: Longest Common Subsequence
 * 
 * LeetCode #1143 - Medium
 * 
 * Given two strings text1 and text2, return the length of their longest common subsequence. 
 * If there is no common subsequence, return 0.
 * 
 * A subsequence of a string is a new string generated from the original string with some 
 * characters (can be none) deleted without changing the relative order of the remaining characters.
 * 
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 * 
 * Constraints:
 * - 1 <= text1.length, text2.length <= 1000
 * - text1 and text2 consist of only lowercase English characters.
 * 
 * Example 1:
 * Input: text1 = "abcde", text2 = "ace"
 * Output: 3
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 * 
 * Example 2:
 * Input: text1 = "abc", text2 = "abc"
 * Output: 3
 * Explanation: The longest common subsequence is "abc" and its length is 3.
 * 
 * Example 3:
 * Input: text1 = "abc", text2 = "def"
 * Output: 0
 * Explanation: There is no such common subsequence, so the result is 0.
 * 
 * Follow-up: Can you solve it using O(min(m, n)) space?
 */
public class Problem03_LongestCommonSubsequence {
    
    /**
     * Find length of longest common subsequence.
     * 
     * @param text1 first string
     * @param text2 second string
     * @return length of longest common subsequence
     */
    public int longestCommonSubsequence(String text1, String text2) {
        // TODO: Implement your solution here
        // Hint: DP - dp[i][j] = LCS length of text1[0:i] and text2[0:j]
        // dp[i][j] = dp[i-1][j-1] + 1 if text1[i-1] == text2[j-1]
        // else dp[i][j] = max(dp[i-1][j], dp[i][j-1])
        // Time complexity: O(m * n)
        // Space complexity: O(m * n) or O(min(m, n)) with optimization
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
