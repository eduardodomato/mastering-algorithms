package com.algorithms.week12_advanced_sorting_searching;

/**
 * Problem 2: Find Peak Element
 * 
 * LeetCode #162 - Medium
 * 
 * A peak element is an element that is strictly greater than its neighbors.
 * 
 * Given a 0-indexed integer array nums, find a peak element, and return its index. 
 * If the array contains multiple peaks, return the index to any of the peaks.
 * 
 * You may imagine that nums[-1] = nums[n] = -∞. You must write an algorithm that 
 * runs in O(log n) time.
 * 
 * Constraints:
 * - 1 <= nums.length <= 1000
 * - -2^31 <= nums[i] <= 2^31 - 1
 * - For all valid i, nums[i] != nums[i + 1]
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * 
 * Example 2:
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak element is 2, 
 * or index number 5 where the peak element is 6.
 * 
 * Follow-up: Your solution should be in O(log N) time complexity.
 */
public class Problem02_FindPeakElement {
    
    /**
     * Find a peak element in the array.
     * 
     * @param nums array of integers
     * @return index of a peak element
     */
    public int findPeakElement(int[] nums) {
        // TODO: Implement your solution here
        // Hint: Use binary search - go towards the side with higher value
        // Time complexity: O(log n)
        // Space complexity: O(1)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
