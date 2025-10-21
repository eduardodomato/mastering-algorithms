package com.algorithms.week10_dynamic_programming_1d;

/**
 * Problem 3: Longest Increasing Subsequence
 * 
 * LeetCode #300 - Medium
 * 
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 * 
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements 
 * without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence 
 * of [0,3,1,6,2,2,7].
 * 
 * Constraints:
 * - 1 <= nums.length <= 2500
 * - -10^4 <= nums[i] <= 10^4
 * 
 * Example 1:
 * Input: nums = [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,18], therefore the length is 4.
 * 
 * Example 2:
 * Input: nums = [0,1,0,3,2,3]
 * Output: 4
 * 
 * Example 3:
 * Input: nums = [7,7,7,7,7,7,7]
 * Output: 1
 * 
 * Follow-up: Can you solve it in O(n log n) time complexity?
 */
public class Problem03_LongestIncreasingSubsequence {
    
    /**
     * Find length of longest increasing subsequence.
     * 
     * @param nums array of integers
     * @return length of longest increasing subsequence
     */
    public int lengthOfLIS(int[] nums) {
        // TODO: Implement your solution here
        // Hint: DP - LIS[i] = max(LIS[j] + 1) for all j < i where nums[j] < nums[i]
        // Optimized version uses binary search for O(n log n)
        // Time complexity: O(n^2) basic, O(n log n) optimized
        // Space complexity: O(n)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
