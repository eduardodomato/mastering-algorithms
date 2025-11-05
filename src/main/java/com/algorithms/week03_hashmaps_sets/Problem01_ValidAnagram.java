package com.algorithms.week03_hashmaps_sets;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem 1: Valid Anagram
 * 
 * LeetCode #242 - Easy
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a different word 
 * or phrase, typically using all the original letters exactly once.
 * 
 * Constraints:
 * - 1 <= s.length, t.length <= 5 * 10^4
 * - s and t consist of lowercase English letters.
 * 
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * 
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 * Example 3:
 * Input: s = "listen", t = "silent"
 * Output: true
 * 
 * Example 4:
 * Input: s = "a", t = "ab"
 * Output: false
 * 
 * Follow-up: What if the inputs contain Unicode characters? How would you adapt your solution?
 */
public class Problem01_ValidAnagram {
    
    /**
     * Check if t is an anagram of s.
     * 
     * @param s first string
     * @param t second string
     * @return true if t is an anagram of s, false otherwise
     */
    public boolean isAnagram(String s, String t) {
        // Hint: If lengths are different, they can't be anagrams
        // Hint: Use HashMap to count character frequencies
        // Hint: Count characters in s, then decrement for characters in t
        // Hint: If all counts are zero, they are anagrams
        // Hint: You can return false early if any count becomes negative
        // Time complexity: O(n) where n is the length of the strings
        // Space complexity: O(1) since we have at most 26 characters (or O(k) for k unique chars)
        
        // TODO: Implement your solution here
        
        return false; // Placeholder - replace with your implementation
    }
}

