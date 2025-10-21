package com.algorithms.week03_hashmaps_sets;

import java.util.*;

/**
 * Implementation examples for Week 3: Hash Maps & Sets
 * 
 * This class contains core implementations and utility methods for hash-based data structures.
 * Study these implementations to understand the fundamental patterns before solving the practice problems.
 */
public class Week03_Implementation {
    
    /**
     * Check if two strings are anagrams using HashMap
     * 
     * @param s first string
     * @param t second string
     * @return true if anagrams, false otherwise
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count characters in first string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Decrease count for characters in second string
        for (char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
            if (charCount.get(c) < 0) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Group anagrams using HashMap with sorted string as key
     * 
     * @param strs array of strings
     * @return list of groups where each group contains anagrams
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        
        return new ArrayList<>(groups.values());
    }
    
    /**
     * Find longest consecutive sequence using HashSet
     * 
     * @param nums array of integers
     * @return length of longest consecutive sequence
     */
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int longestStreak = 0;
        
        for (int num : numSet) {
            // Only start counting from the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
    
    /**
     * Find two numbers that sum to target using HashMap
     * 
     * @param nums array of integers
     * @param target target sum
     * @return indices of the two numbers
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        
        return new int[0]; // No solution found
    }
    
    /**
     * Check if array contains duplicates using HashSet
     * 
     * @param nums array of integers
     * @return true if contains duplicates, false otherwise
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        
        return false;
    }
    
    /**
     * Find intersection of two arrays using HashSet
     * 
     * @param nums1 first array
     * @param nums2 second array
     * @return array containing intersection elements
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        Set<Integer> intersection = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }
    
    /**
     * Count frequency of elements in array using HashMap
     * 
     * @param nums array of integers
     * @return map with element as key and frequency as value
     */
    public static Map<Integer, Integer> countFrequency(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        return frequency;
    }
    
    /**
     * Find first non-repeating character in string using HashMap
     * 
     * @param s input string
     * @return first non-repeating character, or null if none found
     */
    public static Character firstNonRepeatingChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count frequency
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Find first character with count 1
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        
        return null;
    }
}
