package com.algorithms.week12_advanced_sorting_searching;

/**
 * Problem 1: Search in Rotated Sorted Array
 * 
 * LeetCode #33 - Medium
 * 
 * There is an integer array nums sorted in ascending order (with distinct values).
 * 
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
 * index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., 
 * nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] 
 * might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * 
 * Given the array nums after the possible rotation and an integer target, return the index 
 * of target if it is in nums, or -1 if it is not in nums.
 * 
 * Constraints:
 * - 1 <= nums.length <= 5000
 * - -10^4 <= nums[i] <= 10^4
 * - All values of nums are unique.
 * - nums is an ascending array that is possibly rotated.
 * - -10^4 <= target <= 10^4
 * 
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * 
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * 
 * Example 3:
 * Input: nums = [1], target = 0
 * Output: -1
 * 
 * Follow-up: Can you solve it in O(log n) time complexity?
 */
public class Problem01_SearchInRotatedSortedArray {
    
    /**
     * Search for target in rotated sorted array.
     * 
     * @param nums rotated sorted array
     * @param target value to search for
     * @return index of target, or -1 if not found
     */
    public int search(int[] nums, int target) {
        // TODO: Implement your solution here
        // Hint: Use modified binary search - find which half is sorted
        // Time complexity: O(log n)
        // Space complexity: O(1)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
