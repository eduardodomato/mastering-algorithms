package com.algorithms.week01_arrays_strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Longest Substring Without Repeating Characters
 */
class Problem03_LongestSubstringWithoutRepeatingTest {
    
    private Problem03_LongestSubstringWithoutRepeating solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_LongestSubstringWithoutRepeating();
    }
    
    @Test
    void testLengthOfLongestSubstring_Example1() {
        String s = "abcabcbb";
        int expected = 3;
        int result = solution.lengthOfLongestSubstring(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLongestSubstring_Example2() {
        String s = "bbbbb";
        int expected = 1;
        int result = solution.lengthOfLongestSubstring(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLongestSubstring_Example3() {
        String s = "pwwkew";
        int expected = 3;
        int result = solution.lengthOfLongestSubstring(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLongestSubstring_EmptyString() {
        String s = "";
        int expected = 0;
        int result = solution.lengthOfLongestSubstring(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLongestSubstring_SingleCharacter() {
        String s = "a";
        int expected = 1;
        int result = solution.lengthOfLongestSubstring(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLongestSubstring_AllUnique() {
        String s = "abcdef";
        int expected = 6;
        int result = solution.lengthOfLongestSubstring(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLongestSubstring_WithSpaces() {
        String s = "a b c d e";
        int expected = 9; // All characters including spaces are unique
        int result = solution.lengthOfLongestSubstring(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLongestSubstring_MixedCase() {
        String s = "aAbBcCdD";
        int expected = 8; // All characters are unique (case sensitive)
        int result = solution.lengthOfLongestSubstring(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLongestSubstring_NumbersAndSymbols() {
        String s = "a1b2c3d4";
        int expected = 8; // All characters are unique
        int result = solution.lengthOfLongestSubstring(s);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testLengthOfLongestSubstring_LongString() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        int expected = 26; // All characters are unique
        int result = solution.lengthOfLongestSubstring(s);
        
        assertEquals(expected, result);
    }
}
