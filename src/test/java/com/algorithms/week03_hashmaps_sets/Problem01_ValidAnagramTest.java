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
        assertTrue(solution.isAnagram(s, t));
    }
    
    @Test
    void testIsAnagram_Example2() {
        String s = "rat";
        String t = "car";
        assertFalse(solution.isAnagram(s, t));
    }
    
    @Test
    void testIsAnagram_SameString() {
        String s = "listen";
        String t = "listen";
        assertTrue(solution.isAnagram(s, t));
    }
    
    @Test
    void testIsAnagram_DifferentLength() {
        String s = "a";
        String t = "ab";
        assertFalse(solution.isAnagram(s, t));
    }
    
    @Test
    void testIsAnagram_SingleCharacter() {
        String s = "a";
        String t = "a";
        assertTrue(solution.isAnagram(s, t));
    }
    
    @Test
    void testIsAnagram_EmptyStrings() {
        String s = "";
        String t = "";
        assertTrue(solution.isAnagram(s, t));
    }
    
    @Test
    void testIsAnagram_RepeatedCharacters() {
        String s = "aabbcc";
        String t = "ccbbaa";
        assertTrue(solution.isAnagram(s, t));
    }
}
