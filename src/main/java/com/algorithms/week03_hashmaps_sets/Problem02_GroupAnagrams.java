package com.algorithms.week03_hashmaps_sets;

import java.util.List;

/**
 * Problem 2: Group Anagrams
 * 
 * LeetCode #49 - Medium
 * 
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 * 
 * Constraints:
 * - 1 <= strs.length <= 10^4
 * - 0 <= strs[i].length <= 100
 * - strs[i] consists of lowercase English letters only.
 * 
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 * 
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 * 
 * Follow-up: Could you solve it without sorting?
 */
public class Problem02_GroupAnagrams {
    
    /**
     * Group anagrams together.
     * 
     * @param strs array of strings
     * @return list of groups where each group contains anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // TODO: Implement your solution here
        // Hint: Use HashMap with sorted string as key
        // Time complexity: O(n * k log k) where k is average string length
        // Space complexity: O(n * k)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
