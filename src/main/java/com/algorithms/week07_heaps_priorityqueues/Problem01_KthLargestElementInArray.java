package com.algorithms.week07_heaps_priorityqueues;

/**
 * Problem 1: Kth Largest Element in an Array
 * 
 * LeetCode #215 - Medium
 * 
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * 
 * Note that it is the kth largest element in sorted order, not the kth distinct element.
 * 
 * Constraints:
 * - 1 <= k <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * 
 * Example 1:
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * 
 * Example 2:
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 * 
 * Follow-up: Can you solve it in O(n) time complexity?
 */
public class Problem01_KthLargestElementInArray {
    
    /**
     * Find the kth largest element in the array.
     * 
     * @param nums array of integers
     * @param k position of largest element to find
     * @return kth largest element
     */
    public int findKthLargest(int[] nums, int k) {
        // TODO: Implement your solution here
        // Hint: Use min heap of size k or quick select algorithm
        // Time complexity: O(n log k) with heap, O(n) average with quick select
        // Space complexity: O(k) with heap, O(1) with quick select
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
