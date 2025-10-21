package com.algorithms.week05_stacks_queues;

/**
 * Problem 2: Daily Temperatures
 * 
 * LeetCode #739 - Medium
 * 
 * Given an array of integers temperatures represents the daily temperatures, 
 * return an array answer such that answer[i] is the number of days you have to wait 
 * after the ith day to get a warmer temperature. If there is no future day for which 
 * this is possible, keep answer[i] == 0 instead.
 * 
 * Constraints:
 * - 1 <= temperatures.length <= 10^5
 * - 30 <= temperatures[i] <= 100
 * 
 * Example 1:
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 * 
 * Example 2:
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 * 
 * Example 3:
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 * 
 * Follow-up: Can you solve it in O(n) time complexity?
 */
public class Problem02_DailyTemperatures {
    
    /**
     * Find number of days to wait for warmer temperature.
     * 
     * @param temperatures array of daily temperatures
     * @return array of days to wait for warmer temperature
     */
    public int[] dailyTemperatures(int[] temperatures) {
        // TODO: Implement your solution here
        // Hint: Use monotonic stack to track indices
        // Time complexity: O(n)
        // Space complexity: O(n)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
