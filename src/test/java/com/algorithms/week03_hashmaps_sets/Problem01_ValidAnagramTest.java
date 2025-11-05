package com.algorithms.week03_hashmaps_sets;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Valid Anagram
 */
class Problem01_ValidAnagramTest {
    
    private Problem01_ValidAnagram solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_ValidAnagram();
    }
    
    @Test
    void testIsAnagram_Example1() {
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsAnagram_Example2() {
        String s = "rat";
        String t = "car";
        boolean expected = false;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsAnagram_Example3() {
        String s = "listen";
        String t = "silent";
        boolean expected = true;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsAnagram_Example4() {
        String s = "a";
        String t = "ab";
        boolean expected = false;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsAnagram_SingleChar() {
        String s = "a";
        String t = "a";
        boolean expected = true;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsAnagram_DifferentLengths() {
        String s = "abc";
        String t = "abcd";
        boolean expected = false;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsAnagram_EmptyStrings() {
        String s = "";
        String t = "";
        boolean expected = true;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsAnagram_SameCharacters() {
        String s = "aaa";
        String t = "aaa";
        boolean expected = true;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsAnagram_DifferentFrequency() {
        String s = "aab";
        String t = "abb";
        boolean expected = false;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsAnagram_LongStrings() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String t = "zyxwvutsrqponmlkjihgfedcba";
        boolean expected = true;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsAnagram_RepeatedChars() {
        String s = "aabbcc";
        String t = "abcabc";
        boolean expected = true;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
    
    @Test
    void testIsAnagram_NotAnagram() {
        String s = "leetcode";
        String t = "codeleet";
        boolean expected = true;
        boolean result = solution.isAnagram(s, t);
        
        assertEquals(expected, result);
    }
}

