package com.algorithms.week10_dynamic_programming_1d;

/**
 * Problem 2: House Robber
 * 
 * LeetCode #198 - Medium
 * 
 * You are a professional robber planning to rob houses along a street. Each house has a 
 * certain amount of money stashed, the only constraint stopping you from robbing each of 
 * them is that adjacent houses have security systems connected and it will automatically 
 * contact the police if two adjacent houses were broken into on the same night.
 * 
 * Given an integer array nums representing the amount of money of each house, return the 
 * maximum amount of money you can rob tonight without alerting the police.
 * 
 * Constraints:
 * - 1 <= nums.length <= 100
 * - 0 <= nums[i] <= 400
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * 
 * Example 2:
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9), and rob house 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 * 
 * Follow-up: Can you solve it using O(1) space?
 */
public class Problem02_HouseRobber {
    
    /**
     * Find maximum amount that can be robbed.
     * 
     * @param nums array representing money in each house
     * @return maximum amount that can be robbed
     */
    public int rob(int[] nums) {
        // TODO: Implement your solution here
        // Hint: DP - rob(i) = max(rob(i-1), rob(i-2) + nums[i])
        // Time complexity: O(n)
        // Space complexity: O(1) with optimization
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
