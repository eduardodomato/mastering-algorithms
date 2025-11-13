package com.algorithms.week01_arrays_strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Problem 3: Longest Substring Without Repeating Characters
 * 
 * LeetCode #3 - Medium
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * Constraints:
 * - 0 <= s.length <= 5 * 10^4
 * - s consists of English letters, digits, symbols and spaces.
 * 
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * Follow-up: Can you solve it in O(n) time?
 */
public class Problem03_LongestSubstringWithoutRepeating {
    
    /**
     * Find the length of the longest substring without repeating characters.
     * 
     * @param s input string
     * @return length of longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        
        // Hint: Use sliding window technique with HashSet or HashMap
        // Time complexity: O(n)
        // Space complexity: O(min(m,n)) where m is the size of the charset
        
        if(s == null || s.length() == 0) return 0;
        
        // Stores the most recent index where each character appeared.
        Map<Character,Integer> visited = new HashMap<>();
        
        // Tracks the best answer seen so far.
        int maxLength = 0;
        // Left index of the current window (inclusive).
        int left = 0;
        // Right index will expand the window (inclusive when used below).
        int right = 0;
        while (right < s.length()) {
           char currentChar = s.charAt(right);
           // If we have seen this character inside the current window,
           // move the left boundary just past the previous occurrence
           // to keep the substring free of duplicates.
           if(visited.containsKey(currentChar) 
                    && visited.get(currentChar) >= left) {
            left = visited.get(currentChar) + 1;
           }
           // Record or update the latest index for this character.
           visited.put(currentChar, right);
           // Update the best window length after extending to right.
           maxLength = Math.max(maxLength, right - left + 1);
           right++;
        }

        return maxLength;

    }
}
