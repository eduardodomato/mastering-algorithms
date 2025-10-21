package com.algorithms.week01_arrays_strings;

/**
 * Implementation examples for Week 1: Arrays & Strings
 * 
 * This class contains core implementations and utility methods for array and string operations.
 * Study these implementations to understand the fundamental patterns before solving the practice problems.
 */
public class Implementation {
    
    /**
     * Two Pointers Technique: Find two numbers that sum to target
     * 
     * @param nums sorted array of integers
     * @param target target sum
     * @return array containing indices of the two numbers, or null if not found
     */
    public static int[] twoSumTwoPointers(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null; // No solution found
    }
    
    /**
     * Sliding Window: Maximum sum of subarray of size k
     * 
     * @param nums array of integers
     * @param k window size
     * @return maximum sum of any subarray of size k
     */
    public static int maxSumSubarray(int[] nums, int k) {
        if (nums.length < k) return -1;
        
        // Calculate sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        
        int maxSum = windowSum;
        
        // Slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum;
    }
    
    /**
     * String Palindrome Check
     * 
     * @param s string to check
     * @return true if string is palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    /**
     * Longest Substring Without Repeating Characters (Sliding Window)
     * 
     * @param s input string
     * @return length of longest substring without repeating characters
     */
    public static int longestUniqueSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        boolean[] seen = new boolean[128]; // ASCII characters
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            // Shrink window from left until no duplicates
            while (seen[c]) {
                seen[s.charAt(left)] = false;
                left++;
            }
            
            seen[c] = true;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
    
    /**
     * Array Reversal
     * 
     * @param nums array to reverse
     */
    public static void reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            // Swap elements
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            
            left++;
            right--;
        }
    }
    
    /**
     * String Reversal
     * 
     * @param s string to reverse
     * @return reversed string
     */
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    
    /**
     * Find Maximum Element in Array
     * 
     * @param nums array of integers
     * @return maximum element
     */
    public static int findMax(int[] nums) {
        if (nums.length == 0) return Integer.MIN_VALUE;
        
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }
    
    /**
     * Count Frequency of Characters in String
     * 
     * @param s input string
     * @return array representing frequency of each character (ASCII)
     */
    public static int[] countCharFrequency(String s) {
        int[] frequency = new int[128]; // ASCII characters
        
        for (char c : s.toCharArray()) {
            frequency[c]++;
        }
        
        return frequency;
    }
}
