package com.algorithms.week03_hashmaps_sets;

import java.util.*;

/**
 * Problem 2: Group Anagrams
 * <p>
 * LeetCode #49 - Medium
 * <p>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word
 * or phrase, typically using all the original letters exactly once.
 * <p>
 * Constraints:
 * - 1 <= strs.length <= 10^4
 * - 0 <= strs[i].length <= 100
 * - strs[i] consists of lowercase English letters.
 * <p>
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 * <p>
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 * <p>
 * Example 4:
 * Input: strs = ["listen","silent","enlist","inlets","listen"]
 * Output: [["listen","silent","enlist","inlets","listen"]]
 * Explanation: All strings are anagrams of each other, so they are grouped together.
 * The duplicate "listen" appears twice in the same group.
 * <p>
 * Follow-up: Can you solve this without sorting each string?
 */
public class Problem02_GroupAnagrams {

    /**
     * Group anagrams together.
     *
     * @param strs array of strings
     * @return list of groups where each group contains anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // Hint: Anagrams have the same character frequency
        // Hint: Use sorted string as key in HashMap
        // Hint: All anagrams will have the same sorted string
        // Hint: Group strings with the same sorted key together
        // Hint: Use Arrays.sort() to sort characters in a string
        // Hint: Use HashMap.computeIfAbsent() or putIfAbsent() to manage groups
        // Time complexity: O(n * k log k) where n is number of strings, k is max string length
        // Space complexity: O(n * k) for storing all strings

        Map<String, List<String>> groupStrings = new HashMap<>();

        for (String str : strs) {

            int[] keyArray = calculateFrecArray(str);
            String key = Arrays.toString(keyArray);

            groupStrings.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }


        return new ArrayList<>(groupStrings.values());
    }

    private int[] calculateFrecArray(String str) {

        int[] frequencyChars = new int[26];
        for (Character c : str.toCharArray()) {
            frequencyChars[c - 'a']++;
        }
        return frequencyChars;

    }
}
