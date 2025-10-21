package com.algorithms.week10_dynamic_programming_1d;

/**
 * Problem 1: Climbing Stairs
 * 
 * LeetCode #70 - Easy
 * 
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Constraints:
 * - 1 <= n <= 45
 * 
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * 
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * 
 * Follow-up: Can you solve it using O(1) space?
 */
public class Problem01_ClimbingStairs {
    
    /**
     * Find number of ways to climb n steps.
     * 
     * @param n number of steps
     * @return number of distinct ways to climb
     */
    public int climbStairs(int n) {
        // TODO: Implement your solution here
        // Hint: This is Fibonacci sequence - ways(n) = ways(n-1) + ways(n-2)
        // Time complexity: O(n)
        // Space complexity: O(1) with optimization
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
