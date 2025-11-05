package com.algorithms.week03_hashmaps_sets;

import java.util.*;

/**
 * Problem 3: Longest Consecutive Sequence
 * 
 * LeetCode #128 - Medium
 * 
 * Given an unsorted array of integers nums, return the length of the longest consecutive 
 * elements sequence.
 * 
 * You must write an algorithm that runs in O(n) time.
 * 
 * Constraints:
 * - 0 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 * 
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. 
 *              Therefore its length is 4.
 * 
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * Explanation: The longest consecutive elements sequence is [0, 1, 2, 3, 4, 5, 6, 7, 8]. 
 *              Therefore its length is 9.
 * 
 * Example 3:
 * Input: nums = [1,2,0,1]
 * Output: 3
 * Explanation: The longest consecutive elements sequence is [0, 1, 2]. 
 *              Therefore its length is 3.
 * 
 * Example 4:
 * Input: nums = []
 * Output: 0
 * 
 * Follow-up: Can you solve it in O(n) time without using extra space?
 */
public class Problem03_LongestConsecutiveSequence {
    
    /**
     * Find the length of the longest consecutive elements sequence.
     * 
     * @param nums unsorted array of integers
     * @return length of the longest consecutive sequence
     */
    public int longestConsecutive(int[] nums) {
        // Hint: Use HashSet for O(1) lookup
        // Hint: Only start counting from the beginning of a sequence
        // Hint: A number is the start of a sequence if (num - 1) is not in the set
        // Hint: For each start, count how many consecutive numbers exist using a while loop
        // Hint: Track the maximum streak length found
        // Time complexity: O(n) - each number is visited at most twice
        // Space complexity: O(n) for the HashSet
        
        // TODO: Implement your solution here
        
        return 0; // Placeholder - replace with your implementation
    }
}

